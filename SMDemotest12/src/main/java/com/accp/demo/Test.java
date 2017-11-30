package com.accp.demo;

import com.accp.entity.User;
import com.accp.servlet.UserServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServlet userServlet = ac.getBean("userServlet", UserServlet.class);
        userServlet.queryUsers();
        System.out.println("***************************");
        userServlet.queryUser(1);
        System.out.println("***************************");
        User u = new User();
        u.setId(2);
        u.setUserName("小明");
        u.setUserPassword("111111");
        userServlet.updateUser(u);
    }
}
