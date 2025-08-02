package com.example.drug.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
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
        page.setDbType(DbType.MYSQL);
        return page;
    }


       /* @Bean
        public MybatisPlusInterceptor mybatisPlusInterceptor() {
            // 这里根据数据库类型而定，这里的连接的数据库类型为POSTGRE_SQL，如果是MYSQL就将POSTGRE_SQL更改为MYSQL
            MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
            interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
            return interceptor;
        }*/



}
