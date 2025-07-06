package com.example.drug.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author chencu
 * @version 1.0
 * @data 2025/7/6 12:45
 */
@Configuration
@MapperScan( value = "com.example.drug.mapper")
public class MybatisPlusConfig {
    @Bean
    public PaginationInnerInterceptor paginationInterceptor(){
        PaginationInnerInterceptor page  =new PaginationInnerInterceptor();
        page.setDbType(DbType.valueOf("mysql"));
        return page;
    }
}
