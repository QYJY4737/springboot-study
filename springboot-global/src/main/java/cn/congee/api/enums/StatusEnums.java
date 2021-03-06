package cn.congee.api.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: yang
 * @Date: 2020-12-07 10:49
 */
public enum StatusEnums {

    SUCCESS(200, "操作成功"),
    SYSTEM_ERROR(500, "系统错误"),
    OTHER(-100, "其他错误");

    @Getter
    @Setter
    private int code;
    @Getter
    @Setter
    private String info;

    StatusEnums(int code, String info) {
        this.code = code;
        this.info = info;
    }

}
