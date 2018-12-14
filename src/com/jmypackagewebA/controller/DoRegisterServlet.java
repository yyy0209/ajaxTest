package com.jmypackagewebA.controller;

import com.jmypackagewebA.pojo.User;
import com.jmypackagewebA.service.IUserService;
import com.jmypackagewebA.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DoRegisterServlet extends HttpServlet {
    private IUserService service = new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("哈哈哈");  //测试语句
        String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        String pwds = req.getParameter("pwds");
        String tele = req.getParameter("tele");
        User u= new User();
        u.setUsername(username);
        u.setPassword(pwd);
        u.setTele(tele);
        if (pwd.equals(pwds)){
            service.insert(u);
            resp.sendRedirect("login");
        }
    }
}
