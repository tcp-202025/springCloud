package cn.project;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 引导类：springBoot程序的入口
 */
/*
@SpringBootApplication//组合注解：启动自动配置，开启扫描
@EnableEurekaClient//通过@EnableEurekaServer注解启动一个服务注册中心提供给其他应用进行对话。
@EnableCircuitBreaker//启动Hystrix熔断器
*/
@SpringCloudApplication//相当于上面三个注解的组合
@EnableFeignClients//启用Feign组件：feign的内部封装了restTemplate，所以不在需要额外使用restTemplate
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class);//这样就可以访问到引导类MySpringBootApplication同级包或者子级包中的controller
    }
}
