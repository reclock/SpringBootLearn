package com.example.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Controller
public class hellocontroller {
    @RequestMapping("/")
    public ModelAndView test(HttpServletRequest req){
        ModelAndView mv = new ModelAndView();
        mv.addObject("haha","hello");
        mv.setViewName("index.html");
        return mv;
    }

    @RequestMapping("/test")
    public String setname(){
        return "name";
    }
}
