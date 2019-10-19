package com.example.gametracker;

import android.os.Bundle;

import com.example.gametracker.domain.Data;
import com.example.gametracker.service.CsGoService;
import com.example.gametracker.service.NetworkService;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        NetworkService networkService = NetworkService.getInstance();
        CsGoService csGoService = networkService.getCsGoService();
        csGoService.getPlayerBySearchQuery("steam","xawdxawdx")
                .enqueue(new Callback<Data>() {
                             @Override
                             public void onResponse(Call<Data> call, Response<Data> response) {
                                 System.out.println(call);
                                 System.out.println(response.body());
                                 Data csData = response.body();
                             }

                             @Override
                             public void onFailure(Call<Data> call, Throwable t) {
                                t.printStackTrace();
                             }
                         });
    }

}
