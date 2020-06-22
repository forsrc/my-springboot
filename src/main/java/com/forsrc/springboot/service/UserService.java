package com.forsrc.springboot.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.forsrc.springboot.entity.User;

@Service
@Transactional(rollbackFor = { Exception.class })
public interface UserService extends BaseService<User, String>{

}
