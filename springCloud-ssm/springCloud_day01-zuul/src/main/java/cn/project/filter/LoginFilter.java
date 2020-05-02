package cn.project.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;

/**
 * 定义zuul网关中的过滤器：模拟一个登陆的拦截
 */
@Component//注入到spring容器
public class LoginFilter extends ZuulFilter {

    /**
     *过滤器的类型：有四种：pre  route  post  error
     */
    @Override
    public String filterType() {
        return "pre";//如果是模拟登陆的拦截，那么就需要在被路由之前判断用户是否登录了
    }

    /**
     *执行顺序，返回值越小，优先级就越高
     */
    @Override
    public int filterOrder() {
        return 10;//写个10保证可扩展性
    }

    /**
     *是否执行过滤器中的run方法，为true则执行，为false不执行
     */
    @Override
    public boolean shouldFilter() {
        return false;
    }

    /**
     *编写过滤器的业务逻辑
     * 返回值：
     *    为null：代表该过滤器什么都不做
     */
    @Override
    public Object run() throws ZuulException {
        /*//1.初始化context上下文对象(使用的是zuul网关中的 RequestContext)
        RequestContext context=RequestContext.getCurrentContext();
        //2.获取request对象
        HttpServletRequest request = context.getRequest();
        //3.就可以获取浏览器中传入的参数了
        request.getParameter();
        //4.做判断
        if(){
            context.sendZuulResponse(false);//拦截该访问，不转发请求

            //给出一些友好提示
            context.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);//状态码设为401：表示身份未认证
            context.setResponseBody("request error");//设置一个响应提示信息
        }*/

        return null;
    }
}
