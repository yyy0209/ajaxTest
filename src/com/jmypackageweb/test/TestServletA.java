package com.jmypackageweb.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class TestServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().setAttribute("servletContext","ervletContext33");//加了这个服务器不关闭，对象就一直存在
        req.getRequestDispatcher("jsp/aindex.jsp").forward(req,resp);
        HttpSession session = req.getSession();   //加了这个浏览器不关闭，就对象一直存在
        session.setAttribute("session", "session");
        req.getRequestDispatcher("jsp/aindex.jsp").forward(req,resp);
        //转发
        req.setAttribute("key","value");  //属性 前面是标识(名)，后面是内容
        /*前面的方法是获取转发器指定放到那个页面，后面方法把service方法的参数传入jsp 。*/
        req.getRequestDispatcher("jsp/aindex.jsp").forward(req,resp);

       /* resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");*/
        /*resp.setContentType("text/html;charset=utf-8");  //设置编码级
        PrintWriter pw = resp.getWriter();  //获取页面显示功能
        pw.write("中文");  //页面上显示文字
        pw.write("<biv style='background-color:#00ff00'>1234</div>"); //页面上显示标签的内容
        System.out.println(req.getContextPath());  //获取项目名
        System.out.println(req.getRequestURL());  //获取全路径
        System.out.println(req.getRequestURI());  //获取项目名和后面的，这个的范围比URL的大
        System.out.println(req.getServletPath()); //路径的最后的那个
        System.out.println(req.getCharacterEncoding());  //获取开始编码级null
        System.out.println(req.getContentType()); //获取类型
        System.out.println(req.getScheme());  //获取协议
        System.out.println(req.getServerName());  //获取本机地址
        System.out.println(req.getServerPort());  //获取端口号*/
    }
}
