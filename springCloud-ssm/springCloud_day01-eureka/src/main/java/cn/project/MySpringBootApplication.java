package cn.project;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 引导类：springBoot程序的入口
 */
@SpringBootApplication//组合注解：启动自动配置，开启扫描
@EnableEurekaServer//通过@EnableEurekaServer注解启动一个服务注册中心提供给其他应用进行对话。
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class);//这样就可以访问到引导类MySpringBootApplication同级包或者子级包中的controller
    }
}
