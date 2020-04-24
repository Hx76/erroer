package com.example.erroer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class UserController {
    @RequestMapping("/showInfo")
    public String showInfo(){
        String str = null;
        str.length();
        return "ok";
    }
    @RequestMapping("/showInfo2")
    public String showInfo2(){
        int a = 10/0;
        return "ok";
    }

//    @ExceptionHandler(value = {java.lang.NullPointerException.class})
//    public ModelAndView nullPointExceptionHandler(Exception e){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("err",e.toString());
//        modelAndView.setViewName("error1");
//        return modelAndView;
//    }
}
