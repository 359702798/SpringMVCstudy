package com.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

     @RequestMapping("hello")
      public  String sayhello(){
             System.out.println("hello world");
             return "success";

         }



}
