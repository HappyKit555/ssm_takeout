package com.yao.ssm_takeout.dto;


import com.yao.ssm_takeout.entity.Setmeal;
import com.yao.ssm_takeout.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
