package cn.project.controller;
import cn.project.client.AccountClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



/**
 * 账户的控制器：对外提供rest风格的接口，对内调用远程接口进行访问
 */
@Controller
@RequestMapping("/customer/account")
public class AccountController {

    @Autowired
    private AccountClient accountClient;

   /* @Autowired
    private DiscoveryClient discoveryClient;//包含了拉取的所有服务信息

    @GetMapping("/findById")
    @ResponseBody
    public Account findById(@RequestParam("id") int id){//@RequestParam接收?后面的参数
        List<ServiceInstance> instances = discoveryClient.getInstances("service-client");//获取服务的集群信息
        ServiceInstance instance = instances.get(0);//获取服务实例(获取服务实例后就可以获取我们要访问的远程服务的端口号，地址名等等，就能够动态拼接字符串）
        return restTemplate.getForObject("http://"+instance.getHost()+":"+instance.getPort()+"/service/account/"+id,Account.class);
    }*/


    @GetMapping("{id}")
    @ResponseBody//返回json数据类型
    public String findById(@PathVariable("id") int id){//@PathVariable接收占位符的值
        return accountClient.queryAccountById(id);//使用feign的方式进行远程调用
    }

}
