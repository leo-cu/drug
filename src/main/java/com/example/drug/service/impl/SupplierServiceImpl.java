package com.example.drug.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.Supplier;
import com.example.drug.mapper.SupplierMapper;
import com.example.drug.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.StringUtils;

import java.util.List;


/**
 * 供应商service实现类
 * @Author：leo Package：com.example.drug.service.impl
 * Project: drug
 * name: SupplierServiceImpl
 * Date: 2025/7/9 20:45
 */
@Component
public class SupplierServiceImpl extends ServiceImpl<SupplierMapper,Supplier> implements ISupplierService {
     @Autowired
    private  SupplierMapper supplierMapper;
    /**
     * 分页查询供应商数据
     * @param pageNum 第几页
     * @param pageSize 每页多少条数据
     * @param param 查询参数
     * @return
     */
    @Override
    public IPage<Supplier> selectSupplierPage(int pageNum, int pageSize, String param) {
        QueryWrapper<Supplier> queryWrapper =new QueryWrapper<>();
        if (!StringUtils.isEmpty(param)){
            queryWrapper.like("supplierName",param);
        }
        Page<Supplier> page=new Page<>(pageNum,pageSize);
        return supplierMapper.selectPage(page,queryWrapper);
    }

    @Override
    public int addSupplier(Supplier supplier) {
        return supplierMapper.insert(supplier);
    }

    @Override
    public int editSupplier(Supplier supplier) {
        return supplierMapper.updateById(supplier);
    }

    @Override
    public Supplier querySupplierById(Integer supplierID) {
        return supplierMapper.selectById(supplierID);
    }

    @Override
    public int DelectSupplierById(Integer supplierID) {
        return supplierMapper.deleteById(supplierID);
    }

    @Override
    public List<Supplier> querySupplierList() {
        return supplierMapper.selectList(null);
    }
}
