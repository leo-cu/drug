package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 供应商
 * @Author：leo Package：com.example.drug.entity
 * Project: drug
 * name: Supplier
 * Date: 2025/7/8 23:20
 */
@Data
@TableName(value="supplier")
public class Supplier implements Serializable {
    /**供应商的唯一标识符**/
    @TableField(value="supplierID")
    @TableId(value="supplierID",type= IdType.AUTO)
    private Integer supplierID;
    /**供应商名称**/
    private  String supplierName;
    /**联系人姓名**/
    private String contactName;
    /**供应商的地址**/
    private String address;
    /**供应商所在到城市**/
    private String city;
    /**创建时间**/
    private Data createtime;
    /**邮政编码**/
    private String postalCode ;
    /**国家**/
    private String country;
    /**联系电话**/
    private String phoneNumber ;
    /**电子邮件地址**/
    private String email ;
    /**供应商的网站地址**/
    private String website ;
    /**供应商描述**/
    private String content;

    public Integer getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Integer supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Data getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Data createtime) {
        this.createtime = createtime;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
