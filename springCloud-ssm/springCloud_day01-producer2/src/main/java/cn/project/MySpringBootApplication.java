package cn.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 引导类：springBoot程序的入口
 */
@SpringBootApplication//组合注解：启动自动配置，开启扫描
@EnableDiscoveryClient//启动eureka客户端
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class);//这样就可以访问到引导类MySpringBootApplication同级包或者子级包中的controller
    }
}
