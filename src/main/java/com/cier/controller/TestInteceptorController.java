package com.cier.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestInteceptorController {
    @RequestMapping("/to_result")
    public ModelAndView toResult(){
        ModelAndView modelAndView = new ModelAndView("result");
        return modelAndView;
    }
}
