package com.yao.ssm_takeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yao.ssm_takeout.entity.ShoppingCart;
import com.yao.ssm_takeout.mapper.ShoppingCartMapper;
import com.yao.ssm_takeout.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
