package com.cier.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        source = source.trim();
        if (StringUtils.isEmpty(source)) {
            return null;
        }
        if (!source.matches("\\d{4}-\\d{1,2}-\\d{1,2}")){
            throw new IllegalArgumentException("this date format is worry");
        }
        return java.sql.Date.valueOf(source);
    }
}
