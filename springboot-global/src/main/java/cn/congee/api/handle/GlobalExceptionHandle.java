package cn.congee.api.handle;

import cn.congee.api.dto.ResponseCode;
import cn.congee.api.enums.StatusEnums;
import cn.congee.api.exception.GlobalException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author: yang
 * @Date: 2020-12-07 10:51
 */
@RestControllerAdvice
@Order(value = Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    public ResponseCode exception(Exception e) {
        e.printStackTrace();
        return new ResponseCode(StatusEnums.SYSTEM_ERROR);
    }

    @ExceptionHandler(value = GlobalException.class)
    public ResponseCode globalExceptionHandle(GlobalException e, HttpServletResponse response) {
        e.printStackTrace();
        return new ResponseCode(response.getStatus(), e.getMsg());
    }

}
