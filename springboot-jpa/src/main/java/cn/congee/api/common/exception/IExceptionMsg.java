package cn.congee.api.common.exception;

/**
 * @Date: 2021/1/6
 * @Time: 17:02
 * @author: wgb
 **/
public interface IExceptionMsg {

    /**
     * 获取异常状态码
     *
     * @return
     */
    Integer getCode();

    /**
     * 获取异常消息
     *
     * @return
     */
    String getMsg();

}
