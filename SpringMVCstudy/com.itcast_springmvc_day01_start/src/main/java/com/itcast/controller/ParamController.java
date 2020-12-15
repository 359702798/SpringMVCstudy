package com.itcast.controller;


import com.itcast.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
