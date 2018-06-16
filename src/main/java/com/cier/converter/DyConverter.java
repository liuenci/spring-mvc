package com.cier.converter;

import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.Set;

public class DyConverter implements Converter<String,Boolean>{
    private static Set<String> trueValues = new HashSet<String>();
    private static Set<String> falseValues = new HashSet<String>();

    static {
        trueValues.add("true");
        trueValues.add("on");
        trueValues.add("yes");
        trueValues.add("1");

        falseValues.add("false");
        falseValues.add("off");
        falseValues.add("no");
        falseValues.add("0");
    }
    @Override
    public Boolean convert(String source) {
        String value = source.trim();
        if ("".equals(value)) {
            return null;
        }
        value = value.toLowerCase();
        if (trueValues.contains(value)) {
            return Boolean.TRUE;
        }
        else if (falseValues.contains(value)) {
            return Boolean.FALSE;
        }
        else {
            throw new IllegalArgumentException("Invalid boolean value '" + source + "'");
        }
    }
}
