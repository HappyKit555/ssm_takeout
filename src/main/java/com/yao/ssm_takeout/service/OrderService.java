package com.yao.ssm_takeout.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yao.ssm_takeout.entity.Orders;

public interface OrderService extends IService<Orders> {


    /**
     * 用户下当
     * @param orders
     */
    public void submit(Orders orders);
}
