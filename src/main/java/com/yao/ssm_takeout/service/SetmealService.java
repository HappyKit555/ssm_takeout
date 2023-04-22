package com.yao.ssm_takeout.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yao.ssm_takeout.dto.SetmealDto;
import com.yao.ssm_takeout.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐，同时保存套餐和菜品的关联信息
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时删除套餐和菜品的关联数据
     * @param ids
     */
    public void  removeWithDish(List<Long> ids);
}
