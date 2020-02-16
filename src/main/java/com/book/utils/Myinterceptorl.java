package com.book.utils;

import com.book.pojo.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 拦截器
 */
public class Myinterceptorl implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handle){

        try {
            User user = (User)request.getSession().getAttribute("user");
            if(user!=null){
                return true;
            }
            response.sendRedirect(request.getContextPath()+"/login.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    public void postHandle(HttpServletRequest  request,
                           HttpServletResponse response,
                           Object handle, ModelAndView modelAndView){
        System.out.println("执行了postHandle方法");
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println("执行了TestInterceptor的afterCompletion方法");
    }
}
