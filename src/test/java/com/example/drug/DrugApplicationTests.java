package com.example.drug;

import com.example.drug.entity.User;
import com.example.drug.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DrugApplicationTests {
    @Autowired
    private IUserService userService;
    @Test
    void contextLoads() {
        User user= new User();
        user.setUsername("admin");
        User user1 = userService.queryUserByUsername(user);
        if (user1!=null){
            System.out.println(user1.getPassword());
        }
    }



}
