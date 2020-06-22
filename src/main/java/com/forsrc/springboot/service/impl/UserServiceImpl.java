package com.forsrc.springboot.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.forsrc.springboot.dao.UserDao;
import com.forsrc.springboot.entity.User;
import com.forsrc.springboot.service.UserService;

@Service
@Transactional(rollbackFor = { Exception.class })
public class UserServiceImpl extends BaseServiceImpl<User, String> implements UserService {

	public UserServiceImpl(@Qualifier("userDao") UserDao userDao) {
		super(userDao);
	}
}
