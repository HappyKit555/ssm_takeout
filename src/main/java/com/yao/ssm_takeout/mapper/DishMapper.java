package com.yao.ssm_takeout.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yao.ssm_takeout.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}