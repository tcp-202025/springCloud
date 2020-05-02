package cn.project.client;

import org.springframework.stereotype.Component;

/**
 * 定义实现熔断的类
 */
@Component//注入spring容器中
public class AccountClientFallback implements AccountClient{
    @Override
    public String queryAccountById(int id) {
        return "服务器正忙，请稍后再试";
    }
}
