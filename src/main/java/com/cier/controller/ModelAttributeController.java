package com.cier.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class ModelAttributeController {
    @ModelAttribute
    public void init(){
        System.out.println("初始化");
    }
    @RequestMapping("to_model")
    @ResponseBody
    public String toModel(@ModelAttribute("test")Date date){
        return date.toString();
    }
}
