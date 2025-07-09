package com.example.drug.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.drug.common.ResultMapUtil;
import com.example.drug.entity.Supplier;
import com.example.drug.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 供应商相关的Controller
 * @Author：leo Package：com.example.drug.controller
 * Project: drug
 * name: SupplierController
 * Date: 2025/7/9 21:14
 */
@Controller
@RequestMapping(value = "/supplier")
public class SupplierController {
    @Autowired
    private ISupplierService supplierService;
    /**
     * 转向供应商页面
     */
    public String supplier(){
        return "/supplier";
    }
    /**
     * 分页查询供应商列表
     */
    @RequestMapping(value = "/supplierQueryPage")
    @ResponseBody
    public Object supplierQueryPage(String param, @RequestParam(defaultValue ="1")int pageNum,@RequestParam(defaultValue = "10")int pageSize){
        try {
            IPage<Supplier> iPage=supplierService.selectSupplierPage(pageNum,pageSize,param);
            return ResultMapUtil.getHashMapMysqlPage(iPage);
        }catch (Exception e){
            return ResultMapUtil.getHashMapException(e);
        }

    }
}
