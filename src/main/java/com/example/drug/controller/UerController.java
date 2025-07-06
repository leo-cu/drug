package com.example.drug.controller;

import com.example.drug.common.ResultMapUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UerController {
    @RequestMapping(value = "/login")
    public String login(){
        return "/login";
    }
    /**
     * 判断用户登录是否成功
     */
    @RequestMapping(value = "/toLogin")
    @ResponseBody
    public  Object toLogin(String username,String password){
      if (username==null||password==null){
          return ResultMapUtil.getHasMapLogin("用户名密码不能为空","2");
      }
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(username,password);
        try {
            subject.login(token);
        }catch (UnknownAccountException e){
            return ResultMapUtil.getHasMapLogin("用户名不存在","");
        }catch(IncorrectCredentialsException e){
            return ResultMapUtil.getHasMapLogin("密码错误","2");
        }
        return ResultMapUtil.getHasMapLogin("验证成功","1");
    }

    /**
     * 转向后台管理首页
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(){
        return "/index";
    }
}
