package com.scxh.dubbo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: 乔童
 * @Description: 用户地址实体类
 * @Date: 2019/12/17 19:16
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress implements Serializable {
    private Integer id;
    /**用户收货地址*/
    private String userAddress;
    /**用户ID*/
    private String userId;
    /**收货人*/
    private String consignee;
    /**手机号*/
    private String phoneNum;
    /**是否默认收货地址*/
    private boolean isDefault;
}
