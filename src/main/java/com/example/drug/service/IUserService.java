package com.example.drug.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.entity.User;

/**
 * 用户表 service 接口
 * 增删改查
 */
public interface IUserService extends IService<User> {
    /**
     * 根据用户名查询用户对象
     * @param user
     * @return
     */
    public  User queryUserByUsername(User user);

}
