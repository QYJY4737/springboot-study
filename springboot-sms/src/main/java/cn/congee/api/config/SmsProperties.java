package cn.congee.api.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: yang
 * @Date: 2020-12-08 7:18
 */
@Data
@ConfigurationProperties(prefix = "congee.sms")
public class SmsProperties {

    String accessKeyId;

    String accessKeySecret;

    String signName;

    String verifyCodeTemplete;

}
