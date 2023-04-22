package com.yao.ssm_takeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yao.ssm_takeout.entity.DishFlavor;
import com.yao.ssm_takeout.mapper.DishFlavorMapper;
import com.yao.ssm_takeout.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
