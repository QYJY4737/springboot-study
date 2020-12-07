package cn.congee.api.annotation;

import java.lang.annotation.*;

/**
 * @Author: yang
 * @Date: 2020-12-07 12:27
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemServiceLog {

    String description() default "";

}
