package com.example.drug.common;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.HashMap;

/**
 * 给前端返回json格式数据
 * @Author：leo Package：com.example.drug
 * Project: drug
 * name: ResulMapUtil
 * Date: 2025/7/8 21:19
 */
public class ResultMapUtil {
    /**
     * 登陆返回结果
     * @param msg
     * @param code
     * @return
     */
    public static HashMap<String,Object> getHasMapLogin( String msg,String code){
        HashMap<String,Object> resultMap =new HashMap();
        resultMap.put("msg",msg);
        resultMap.put("code",code);
        if("1".equals(code)){
            resultMap.put("icon",1);
        }else{
            resultMap.put("icon",3);
        }
        resultMap.put("icon",4);
        return resultMap;
    }
    /**
     * 分页查询结果
     */
    public static HashMap<String,Object> getHashMapMysqlPage(IPage<?> object){
        HashMap<String,Object> resultMap= new HashMap<>();
        resultMap.put("code",0);
        resultMap.put("msg","");
        resultMap.put("count",object.getTotal());
        resultMap.put("data",object.getRecords());
        return resultMap;
    }

    /**
     * 异常数据统一处理
     * @param e
     * @return
     */
    public static HashMap<String,Object> getHashMapException(Exception e){
        HashMap<String,Object> resultMap= new HashMap<>();
        resultMap.put("code",0);
        resultMap.put("msg",e.getMessage());
        return resultMap;
    }
}
