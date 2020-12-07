package cn.congee.api.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: yang
 * @Date: 2020-12-07 10:50
 */
public class GlobalException extends RuntimeException {

    @Getter
    @Setter
    private String msg;

    public GlobalException(String message) {
        this.msg = message;
    }

}
