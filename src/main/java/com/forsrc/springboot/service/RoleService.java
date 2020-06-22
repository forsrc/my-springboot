package com.forsrc.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.forsrc.springboot.entity.Role;
import com.forsrc.springboot.entity.RolePk;

@Service
@Transactional(rollbackFor = { Exception.class })
public interface RoleService extends BaseService<Role, RolePk> {

	List<Role> findByUsername(String username);

	void deleteByUsername(String username);
}
