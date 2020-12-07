package cn.congee.api.config;

import cn.congee.api.utils.RsaUtils;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;
import java.io.File;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * @Author: yang
 * @Date: 2020-12-08 4:25
 */
@Data
@Slf4j
@ConfigurationProperties(prefix = "congee.jwt")
public class JwtProperties {

    // 密钥
    private String secret;
    // 公钥
    private String pubKeyPath;
    // 私钥
    private String priKeyPath;
    // token过期时间
    private int expire;
    // 公钥
    private PublicKey publicKey;
    // 私钥
    private PrivateKey privateKey;

    private String cookieName;

    @PostConstruct // 对象一旦实例化后，就读取公钥和私钥
    public void init() {
        try {
            File pubKey = new File(pubKeyPath);
            File priKey = new File(priKeyPath);
            if (!pubKey.exists() || !priKey.exists()) {
                // 生成公钥和私钥
                RsaUtils.generateKey(pubKeyPath, priKeyPath, secret);
            }
            // 获取公钥和私钥
            this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
            this.privateKey = RsaUtils.getPrivateKey(priKeyPath);
        } catch (Exception e) {
            log.error("初始化公钥和私钥失败！", e);
            throw new RuntimeException();
        }
    }

}
