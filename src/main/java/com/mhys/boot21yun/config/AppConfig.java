package com.mhys.boot21yun.config;
import com.mhys.boot21yun.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
public class AppConfig {

    @Bean
    public HelloService helloService(){
        System.out.println("配置类通过@Bean注解向容器中添加组件！");
        return new HelloService();
    }
}
