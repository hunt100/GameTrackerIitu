package com.example.gametracker.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @SerializedName("data")
    private List<PlatformInfo> platformInfos;

    public Data() {
    }

    public Data(List<PlatformInfo> platformInfos) {
        this.platformInfos = platformInfos;
    }

    public List<PlatformInfo> getPlatformInfos() {
        return platformInfos;
    }

    public void setPlatformInfos(List<PlatformInfo> platformInfos) {
        this.platformInfos = platformInfos;
    }
}
