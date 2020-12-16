package cn.congee.annotation;

import cn.congee.enums.AnalyzerType;
import cn.congee.enums.FieldType;

import java.lang.annotation.*;

/**
 * 作用在字段上，用于定义类型，映射关系
 *
 * @Author: yang
 * @Date: 2020-12-16 9:32
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Inherited
public @interface Field {

    FieldType type() default FieldType.TEXT;

    /**
     * 指定分词器
     * @return
     */
    AnalyzerType analyzer() default AnalyzerType.STANDARD;

}
