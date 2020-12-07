package cn.congee.api.realm;

import cn.congee.api.entity.User;
import cn.congee.api.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: yang
 * @Date: 2020-12-08 3:50
 */
@Slf4j
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        log.info("-------------------------------> 认证");
        String userName = (String) token.getPrincipal();
        User user = userService.findByUserName(userName);
        if (user == null) {
            throw new UnknownAccountException();
        }
        String salt = "sdfnegaf7gafj3nfdsfdsj9"; // 盐可以自定义
        return new SimpleAuthenticationInfo(user, user.getUserPwd(), ByteSource.Util.bytes(salt), getName());
    }

}
