package com.example.drug.common;

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
}
