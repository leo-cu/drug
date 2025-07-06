package com.example.drug.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author chencu
 * @version 1.0
 * @data 2025/7/6 13:36
 */
@Configuration
public class ShiroFilterConfiguration {
    /**
     * 创建过滤工厂bean
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean() {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager());
        /**
         * shiro内置过滤器，实现权限相关的拦截器
         * anon:无需登录，可以访问
         * anthc：必须登录才可以访问
         */
        Map<String,String> filterMap =new LinkedHashMap<>();
        filterMap.put("/static/**","anon");
        filterMap.put("/login","anon");
        filterMap.put("/toLogin","anon");
        filterMap.put("/**","authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        shiroFilterFactoryBean.setLoginUrl("/login");
        //登录后自动转向的页面
        shiroFilterFactoryBean.setSuccessUrl("/index");
        return shiroFilterFactoryBean;
    }

    /**
     * 权限管理
     * @return
     */
    @Bean
    public DefaultWebSecurityManager securityManager(){
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm());
        return securityManager;
    }

    /**
     * 创建Realm，认证用
     * @return
     */
    @Bean
    public UserRealm userRealm(){
        UserRealm userRealm=new UserRealm();
        return userRealm;
    }
    /**
     * tymeleaf整合shiro
     */
   @Bean
    public ShiroDialect shiroDialect(){
       return new ShiroDialect();
   }
}


