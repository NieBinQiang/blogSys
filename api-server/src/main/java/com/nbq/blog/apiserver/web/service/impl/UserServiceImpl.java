package com.nbq.blog.apiserver.web.service.impl;

import com.nbq.blog.apiserver.web.entity.User;
import com.nbq.blog.apiserver.web.mapper.UserMapper;
import com.nbq.blog.apiserver.web.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Ben
 * @since 2018-09-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
