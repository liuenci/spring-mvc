package com.cier.converter;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;

public class ConverterDemo {

    public static void main(String[] args) {

        ConversionService service = new DefaultConversionService();
        Boolean b = service.convert("true",Boolean.class);
        System.out.println(b.getClass());

        List<String> strings = Arrays.asList("张三","李四");
        String[] str = service.convert(strings,String[].class);
        System.out.println(str.toString());

        List<String> list = service.convert(new String[]{"ab","bc","cd"},List.class);
        System.out.println(list);

        // 注册
        DefaultConversionService defaultConversionService = new DefaultConversionService();
        defaultConversionService.addConverter(new DyConverter());
        System.out.println(defaultConversionService.convert("NO",Boolean.class));

        // String 转 PhoneNumber
        System.out.println(new StringToPhone().convert("0731-100000"));

        System.out.println(new StringToDateConverter().convert("2016-12-12"));
    }
}
