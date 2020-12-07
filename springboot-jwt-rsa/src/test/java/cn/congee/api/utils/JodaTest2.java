package cn.congee.api.utils;


import org.joda.time.DateTime;
import org.joda.time.LocalDate;


/**
 * @Author: yang
 * @Date: 2020-12-08 6:30
 */
public class JodaTest2 {

    public static void main(String[] args) {
        DateTime today = new DateTime();
        DateTime datetorrow = today.plusDays(1);

        System.out.println(today.toString("yyyy-MM-dd"));//2017-06-26
        System.out.println(today.toString("yyyy-MM-dd HH:mm:ss"));//2017-06-26 22:04:03
        System.out.println(datetorrow.toString("yyyy-MM-dd"));//2017-06-27

        System.out.println("......................");

        //获得一个时间的副本，将day设置成自己制定的时间,不改变月份，只改变日期
        DateTime d1 = today.withDayOfMonth(1);
        System.out.println(d1.toString("yyyy-MM-dd"));//2017-06-01

        System.out.println("......................");

        LocalDate localDate = new LocalDate();
        System.out.println(localDate);//2017-06-26

        System.out.println("........................");

        //获取当前时间三个月后的月份的最后一天
        localDate = localDate.plusMonths(3).dayOfMonth().withMaximumValue();
        System.out.println(localDate);//2017-09-30

        System.out.println("........................");


        //计算二年前第三个月最后一天的日期
        DateTime dateTime = new DateTime();
        DateTime dateTime2 = dateTime.minusYears(2).monthOfYear().setCopy(3).
                dayOfMonth().withMinimumValue();
        System.out.println(dateTime2.toString("yyyy-MM-dd"));//2017-09-30

    }

}
