package com.yao.ssm_takeout.dto;


import com.yao.ssm_takeout.entity.OrderDetail;
import com.yao.ssm_takeout.entity.Orders;
import lombok.Data;
import java.util.List;

@Data
public class OrdersDto extends Orders {

    private String userName;

    private String phone;

    private String address;

    private String consignee;

    private List<OrderDetail> orderDetails;
	
}
