package com.tcc.myweb;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author tengcongcong
 * @create 2017-08-15 11:14
 * @Version 1.0
 **/
public class SimpleServlet extends HttpServlet {
    @Autowired
    private SimpleService simpleService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        out.flush();
        out.close();
    }
}
