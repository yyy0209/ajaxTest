package com.jmypackagewebA.controller;  /*这个包存放界面控制的java代码*/

import com.jmypackagewebA.pojo.User;
import com.jmypackagewebA.service.IUserService;
import com.jmypackagewebA.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*填写用户名密码点击登录会通过web的这个java类，在这么获取用户名和密码，
* 通过用户名去数据库查找这个用户，1、当获取为null会重定向去注册界面，
* 2、获取成功，会判断密码，成功会重定向到登录界面。
* */
public class DoLoginServlet extends HttpServlet {
    private IUserService service = new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("pwd");
        //System.out.println(username + "" + password);  //测试语句u
        User u = service.getOne(username);
        System.out.println(u);  //测试语句u
        if (u==null){    /*跳转注册界面*/
            resp.sendRedirect("register");
        }else {
            if (u.getPassword().equals(password)){
                /*重定向*/
                resp.sendRedirect("list");
            }else{
                /*重定向*/
                resp.sendRedirect("login");
            }
        }
    }
}
