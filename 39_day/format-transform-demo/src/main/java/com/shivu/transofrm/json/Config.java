package com.shivu.transofrm.json;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Config {

    @SerializedName("app_name")
    private String appName;
    @SerializedName("app_version")
    private String appVersion;
    @SerializedName("debug_mode")
    private Boolean debugMode;
    @SerializedName("max_users")
    private Integer maxUsers;
}
