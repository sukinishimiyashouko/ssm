package com.wbu.ssm.mvc.utils;

/**
 * @auther aqing
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class CodeUtils {
    public static String getCode(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
//        System.out.println(sdf.format(new Date()));
        return "T-"+sdf.format(new Date())+"\n";
    }
}
