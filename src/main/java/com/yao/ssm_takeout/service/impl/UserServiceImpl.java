package com.yao.ssm_takeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yao.ssm_takeout.entity.User;
import com.yao.ssm_takeout.mapper.UserMapper;
import com.yao.ssm_takeout.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
