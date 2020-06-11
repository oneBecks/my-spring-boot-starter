package com.zhy.zhytest;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Aurhor zhy
 * @Date 2020/4/8 15:54
 * @Description TODO
 * @Version 1.0
 **/
@ConfigurationProperties(prefix = "zhy")
public class HelloProperties {
    private static final String DEFAULT_NAME= "zhy";
    private static final String DEFAULT_MSG= "hello";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String name = DEFAULT_NAME;
    private String msg = DEFAULT_MSG;

}
