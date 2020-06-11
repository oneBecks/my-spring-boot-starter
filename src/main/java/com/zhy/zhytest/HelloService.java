package com.zhy.zhytest;


/**
 * @Aurhor zhy
 * @Date 2020/4/8 15:58
 * @Description TODO
 * @Version 1.0
 **/
public class HelloService {
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

    private String name;
    private String msg;
    public String sayHello(){
        return name + " say " + msg;
    }
}
