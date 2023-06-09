package com.yao.ssm_takeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yao.ssm_takeout.entity.OrderDetail;
import com.yao.ssm_takeout.mapper.OrderDetailMapper;
import com.yao.ssm_takeout.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
