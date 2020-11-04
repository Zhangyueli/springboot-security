package com.zyl.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }

    @RequestMapping({"/toLogin"})
    public String toLogin(){
        return "views/login";
    }

    @RequestMapping({"/user1/{id}"})
    public String user1(@PathVariable("id") int id){
        return "views/user1/p"+id;
    }
    @RequestMapping({"/user2/{id}"})
    public String user2(@PathVariable("id") int id){
        return "views/user2/p"+id;
    }
    @RequestMapping({"/user3/{id}"})
    public String user3(@PathVariable("id") int id){
        return "views/user3/p"+id;
    }
}
