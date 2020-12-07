package cn.congee.api.annotation;

import java.lang.annotation.*;

/**
 * @Author: yang
 * @Date: 2020-12-07 12:26
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})//作用在参数和方法上
@Retention(RetentionPolicy.RUNTIME)//运行时注解
@Documented//表明这个注解应该被 javadoc工具记录
public @interface SystemControllerLog {

    String description() default "";

}
