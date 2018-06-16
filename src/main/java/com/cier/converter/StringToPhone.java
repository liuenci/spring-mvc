package com.cier.converter;

import com.cier.pojo.PhoneNumber;
import org.springframework.core.convert.converter.Converter;

public class StringToPhone implements Converter<String, PhoneNumber> {
    @Override
    public PhoneNumber convert(String source) {
        source = source.trim();
        PhoneNumber phoneNumber = new PhoneNumber();
        if (source.matches("^[0][1-9]{2,3}-[0-9]{5,10}$")){
            String[] str = source.split("-");
            phoneNumber.setArea(str[0]);
            phoneNumber.setNumber(str[1]);
        } else {
            try {
                throw new Exception("数字格式化异常");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return phoneNumber;
    }
}
