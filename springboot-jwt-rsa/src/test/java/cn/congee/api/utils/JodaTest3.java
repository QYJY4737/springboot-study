package cn.congee.api.utils;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

import java.util.Date;

/**
 * @Author: yang
 * @Date: 2020-12-08 6:31
 */
public class JodaTest3 {

    //将utc时间转换成java中的Date格式
    public static Date convertUTC2Date(String utcDate){
        try{
            DateTime dateTime =DateTime.parse(utcDate, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
            return dateTime.toDate();
        }catch (Exception ex){
            return null;
        }
    }

    //将java中的date格式的时间转换成utc时间标准
    public static String ConvertDate2UTC(Date javaDate){
        DateTime dateTime = new DateTime(javaDate, DateTimeZone.UTC);
        return dateTime.toString();
    }

    //将Date类型转换成字符串
    public static String convertDate2LocalByDateformat(Date javaDate,String dateFormat){
        DateTime dateTime = new DateTime(javaDate);
        return dateTime.toString(dateFormat);
    }


    public static void main(String[] args) {
        System.out.println(JodaTest3.convertUTC2Date("2010-12-1T11:22:33.567Z"));//Wed Dec 01 19:22:33 CST 2010
        System.out.println(JodaTest3.ConvertDate2UTC(new Date()));//2017-06-26T14:09:53.606Z
        System.out.println(JodaTest3.convertDate2LocalByDateformat(new Date(),"yyyy-MM-dd HH:mm:ss"));//2017-06-26 22:09:53
    }

}
