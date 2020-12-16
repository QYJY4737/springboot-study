package cn.congee.annotation;

import java.lang.annotation.*;

/**
 * 用于标识使用 该字段作为ES数据中的id
 *
 * @Author: yang
 * @Date: 2020-12-16 9:31
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Inherited
public @interface EsId {
}
