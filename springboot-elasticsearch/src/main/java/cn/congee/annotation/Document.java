package cn.congee.annotation;

import java.lang.annotation.*;
/**
 * 这里简单说一下，索引就相当于是表结构，es本身也是存储数据的，既然是存储，就需要定一个结构，比如有哪些字段，每个字段是什么类型。但是痛点是如果我们定义的这个结构如果比较复杂，那么用原生的方法代码会很多，很麻烦，所以我们可以自己定义一套注解，加入到实体类上，这样就可以根据实体类，让es自己去创建索引，很方便。就类似于以前hibernate，可以根据我们写的实体类自动生成表。
 *
 * 关于注解，这里也给出以下，在之前文章基础上做了些改动，主要就是加入了EsId注解，可以将制定字段作为es的id,如果不加这个，es默认id是自动生成的，有了这个，那么我们可以让mysql的id直接作为es的id，方便更新。
 */

/**
 * Es 文档注解，用于做索引实体映射
 * 作用在类上
 *
 * @Author: yang
 * @Date: 2020-12-16 9:31
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Inherited
public @interface Document {

    /**
     * index : 索引名称
     * @return
     */
    String index();

    /**
     * 类型名称
     * @return
     */
    String type();

}
