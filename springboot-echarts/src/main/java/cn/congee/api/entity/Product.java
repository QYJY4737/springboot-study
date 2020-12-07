package cn.congee.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: yang
 * @Date: 2020-12-07 9:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    public String productName;

    public Integer nums;

}
