package com.example.drug.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.entity.Supplier;
import com.example.drug.entity.User;

import java.util.List;

/**
 * 供应商到Service接口
 * @Author：leo Package：com.example.drug.service
 * Project: drug
 * name: ISupplierService
 * Date: 2025/7/9 17:48
 */
public interface ISupplierService extends IService<Supplier> {
    /**
     * 分页查询供应商
     * @param pageNum 第几页
     * @param pageSize 每页多少条数据
     * @param param 查询参数
     * @return
     */
    public IPage<Supplier> selectSupplierPage(int pageNum,int pageSize,String param);

    /**
     * 新增供应商
     * @param supplier
     * @return
     */
    public int addSupplier(Supplier supplier);
    /**
     * 修改供应商
     * @param supplier
     * @return
     */
    public int editSupplier(Supplier supplier);

    /**
     * 根据主键id查询一个供应商对象
     * @param supplierID
     * @return
     */
    public Supplier querySupplierById(Integer supplierID);

    /**
     * 根据主键ID删除供应商对象
     * @param supplierID
     * @return
     */
    public int DelectSupplierById(Integer supplierID);

    /**
     * 查询所有供应商
     * @return
     */
    public List<Supplier> querySupplierList();
}
