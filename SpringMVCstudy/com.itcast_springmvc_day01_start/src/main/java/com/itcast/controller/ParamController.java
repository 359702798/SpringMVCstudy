package com.itcast.controller;


import com.itcast.domain.Account;
import com.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping("/testParam1")
    public  String testParam1(String username,String password){
        System.out.println("username= "+username);
        System.out.println("password="+password);

        return "success";
    }

    @RequestMapping("/testParam2")
    public  String testParam2(Account account){

        System.out.println(account);
        return "success";
    }

    @RequestMapping("/testParam3")
    public  String testParam3(User user){

        System.out.println(user);
        return "success";
    }

    @RequestMapping("/testParam4")
    public  String testParam2(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("执行了。。。");
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(session);
        System.out.println(username);
        System.out.println(password);
        return "success";
    }
}
