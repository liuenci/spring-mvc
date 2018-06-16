package com.cier.controller;

import com.cier.pojo.Address;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/rand")
    public ModelAndView rand(){
        ModelAndView modelAndView = new ModelAndView("result");
        int num = (int)(1 + Math.random() * (300 - 100 + 1));
        modelAndView.addObject("num",num);
        return modelAndView;
    }

    @RequestMapping(value = "/result",method = RequestMethod.POST)
    public String result(Address address){
        System.out.println(address);
        return "result";
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/address",method = RequestMethod.GET)
    public String address(){
        return "address";
    }
}
