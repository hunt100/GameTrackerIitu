package com.example.gametracker.domain;

import com.google.gson.annotations.SerializedName;

public class PlatformInfo {
    @SerializedName("platformId")
    private int platformId;

    @SerializedName("platformSlug")
    private String platformSlug;

    @SerializedName("platformUserIdentifier")
    private String platformUserIdentifier;

    @SerializedName("platformUserId")
    private String platformUserId;

    @SerializedName("platformUserHandle")
    private String platformUserHandle;

    @SerializedName("avatarUrl")
    private String avatarUrl;

    @SerializedName("additionalParameters")
    private String additionalParameters;

    public PlatformInfo() {
    }

    public PlatformInfo(int platformId, String platformSlug, String platformUserIdentifier, String platformUserId, String platformUserHandle, String avatarUrl, String additionalParameters) {
        this.platformId = platformId;
        this.platformSlug = platformSlug;
        this.platformUserIdentifier = platformUserIdentifier;
        this.platformUserId = platformUserId;
        this.platformUserHandle = platformUserHandle;
        this.avatarUrl = avatarUrl;
        this.additionalParameters = additionalParameters;
    }

    public int getPlatformId() {
        return platformId;
    }

    public void setPlatformId(int platformId) {
        this.platformId = platformId;
    }

    public String getPlatformSlug() {
        return platformSlug;
    }

    public void setPlatformSlug(String platformSlug) {
        this.platformSlug = platformSlug;
    }

    public String getPlatformUserIdentifier() {
        return platformUserIdentifier;
    }

    public void setPlatformUserIdentifier(String platformUserIdentifier) {
        this.platformUserIdentifier = platformUserIdentifier;
    }

    public String getPlatformUserId() {
        return platformUserId;
    }

    public void setPlatformUserId(String platformUserId) {
        this.platformUserId = platformUserId;
    }

    public String getPlatformUserHandle() {
        return platformUserHandle;
    }

    public void setPlatformUserHandle(String platformUserHandle) {
        this.platformUserHandle = platformUserHandle;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAdditionalParameters() {
        return additionalParameters;
    }

    public void setAdditionalParameters(String additionalParameters) {
        this.additionalParameters = additionalParameters;
    }
}
