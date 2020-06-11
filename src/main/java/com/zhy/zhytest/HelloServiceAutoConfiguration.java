package com.zhy.zhytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Aurhor zhy
 * @Date 2020/4/8 16:00
 * @Description TODO
 * @Version 1.0
 **/
@Configuration//开启配置
@EnableConfigurationProperties(HelloProperties.class)//开启使用映射实体对象
@ConditionalOnClass(HelloService.class)//存在HelloService时初始化该配置类
/*@ConditionalOnProperty//存在对应配置信息时初始化该配置类
        (
                prefix = "zhy",//存在配置前缀zhy.hello
                value = "enabled",//开启
                matchIfMissing = true//缺失检查
        )*/
public class HelloServiceAutoConfiguration {
    @Autowired
    HelloProperties helloProperties;
    /**
     * 根据条件判断不存在HelloService时初始化新bean到SpringIoc
     *
     * @return
     */
    @Bean//创建HelloService实体bean
    HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setMsg(helloProperties.getMsg());
        helloService.setName(helloProperties.getName());
        return helloService;
    }

}
