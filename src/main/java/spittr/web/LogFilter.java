package main.java.spittr.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by try on 2015/9/16.
 */
@WebFilter(filterName = "log", urlPatterns = {"/*"})
public class LogFilter implements Filter
{
    private FilterConfig config;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        ServletContext context = this.config.getServletContext();
        long before = System.currentTimeMillis();
        System.out.println("开始过滤...");
        HttpServletRequest hrequest = (HttpServletRequest) request;
        System.out.println("Filter 拦截到用户的请求地址：" + hrequest.getServletPath());
        chain.doFilter(request, response);
        long after = System.currentTimeMillis();
        System.out.println("过滤结束...");
        System.out.println("请求被定位到" + hrequest.getRequestURI() + "  所花的时间为：" + (after - before));
    }

    @Override
    public void destroy()
    {
        this.config = null;
    }
}

