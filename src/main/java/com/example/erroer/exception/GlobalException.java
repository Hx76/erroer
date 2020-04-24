package com.example.erroer.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalException {
//    @ExceptionHandler(value = {java.lang.NullPointerException.class})
//    public ModelAndView nullPointExceptionHandler(Exception e){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("err",e.toString());
//        modelAndView.setViewName("error1");
//        return modelAndView;
//    }
//    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
//    public ModelAndView ArithmeticException(Exception e){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("err",e.toString());
//        modelAndView.setViewName("error2");
//        return modelAndView;
//    }
}
