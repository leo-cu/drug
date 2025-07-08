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
@TableName(value="Supplier")
public class Supplier implements Serializable {
    @TableField(value="id")
    @TableId(value="id",type= IdType.AUTO)
    private Integer id;
}
