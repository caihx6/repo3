package com.caihuaixu.utils;


import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 把字符串转日期
 */
public class StringfToDateConverter implements Converter<String,Date> {


    @Override
    public Date convert(String s) {
        if(s==null){
            throw new RuntimeException("请您输入数据");
        }
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("数据类型转换异常");
        }
    }
}
