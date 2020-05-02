package cn.project.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * feign的客户端接口
 */
@Component
@FeignClient(value = "service-client",fallback = AccountClientFallback.class)//1.指定微服务的名称，表明要调用哪个微服务;2.指定AccountClientFallback是一个熔断类
public interface AccountClient {

    @GetMapping("service/account/{id}")
    @ResponseBody
    public String queryAccountById(@PathVariable("id") int id);//@PathVariable接收占位符的值，适用于Rest风格

}
