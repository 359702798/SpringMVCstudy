package com.itcast.utils;


import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 字符串转日期
 */
public class StringToDateConver implements Converter<String, Date> {


    @Override
    public Date convert(String source) {
        if (source==null){
            throw  new RuntimeException("source为空,请您传入字符串");
        }

       DateFormat df=new SimpleDateFormat("yyyy-MM-dd");

        try {
            return  df.parse(source);
        } catch (ParseException e) {
            throw  new RuntimeException("字符串转换出现异常");
        }

    }
}
