package com.forsrc.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.forsrc.springboot.dao.RoleDao;
import com.forsrc.springboot.dao.mapper.RoleMapper;
import com.forsrc.springboot.entity.Role;
import com.forsrc.springboot.entity.RolePk;
import com.forsrc.springboot.service.RoleService;

@Service
@Transactional(rollbackFor = { Exception.class })
public class RoleServiceImpl extends BaseServiceImpl<Role, RolePk> implements RoleService {

	@Autowired
	@Qualifier("roleDao")
	private RoleDao roleDao;

	@Autowired
	private RoleMapper roleMapper;

	public RoleServiceImpl(@Qualifier("roleDao") RoleDao roleDao) {
		super(roleDao);
	}

	@Override
	public List<Role> findByUsername(String username) {
		return this.roleDao.findByUsername(username);
	}

	@Override
	public void deleteByUsername(String username) {
		this.roleDao.deleteByUsername(username);
	}

	@Override
	public List<Role> getByUsername(String username) {
		return this.roleMapper.getByUsername(username);
	}

}
