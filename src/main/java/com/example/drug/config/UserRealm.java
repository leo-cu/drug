package com.example.drug.config;

import com.example.drug.entity.User;
import com.example.drug.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 权限认证
 * @author chencu
 * @version 1.0
 * @data 2025/7/6 13:45
 */
public class UserRealm extends AuthorizingRealm {
    @Autowired
    private IUserService userService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 登录认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
          UsernamePasswordToken token= (UsernamePasswordToken) authenticationToken;
        String suername = token.getUsername();
        User queryUser = new User();
       queryUser.setUsername(suername);
        User user=userService.queryUserByUsername(queryUser);
        if(user == null){
            return null;
        }
          return new SimpleAuthenticationInfo(user,user.getPassword(),getName());
    }
}
