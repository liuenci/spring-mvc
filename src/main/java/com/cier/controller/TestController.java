package com.cier.controller;

import com.cier.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    /**
     * 非封装类型不能为空
     * 用了别名就不能用 age 传值了
     * @param age
     * @return
     */
    @RequestMapping(value = "baseType.do")
    @ResponseBody
    public String baseType(@RequestParam("xage") int age){
        return "age:"+age;
    }

    /**
     * 包装类型可以为空
     * @param age
     * @return
     */
    @RequestMapping(value = "baseType2.do")
    @ResponseBody
    public String baseType2(Integer age){
        return "age:"+age;
    }

    /**
     * 数组绑定
     * @param name
     * @return
     */
    @RequestMapping(value = "array.do")
    @ResponseBody
    public String array(String[] name){
        StringBuilder stringBuilder = new StringBuilder();
        for (String item : name){
            stringBuilder.append(item).append(" ");
        }
        return stringBuilder.toString();
    }

    /**
     * 对象绑定
     * @param user
     * @return
     */
    @RequestMapping(value = "object.do")
    @ResponseBody
    public String object(User user){
        return user.toString();
    }

}
