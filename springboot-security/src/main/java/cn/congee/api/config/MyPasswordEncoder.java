package cn.congee.api.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author: yang
 * @Date: 2020-12-08 4:05
 */
public class MyPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }

}
