package com.example;

import com.example.network.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        ApplicationContext context = SpringApplication.run(Application.class, args);
        NettyServer nettyServer = context.getBean(NettyServer.class);
        nettyServer.run();
    }

}
