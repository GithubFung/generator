package com.lzj_seckill.service.impl;

import com.lzj_seckill.pojo.User;
import com.lzj_seckill.mapper.UserMapper;
import com.lzj_seckill.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author feng
 * @since 2022-12-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
