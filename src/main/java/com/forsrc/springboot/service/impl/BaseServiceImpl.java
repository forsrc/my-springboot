package com.forsrc.springboot.service.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.forsrc.springboot.dao.BaseDao;
import com.forsrc.springboot.service.BaseService;

@Service
@Transactional(rollbackFor = { Exception.class })
public class BaseServiceImpl<ENTITY, PK> implements BaseService<ENTITY, PK> {

	private BaseDao<ENTITY, PK> baseDao;

	public BaseServiceImpl(BaseDao<ENTITY, PK> baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	@Transactional(readOnly = true)
	public ENTITY get(PK pk) {
		return this.baseDao.getOne(pk);
	}

	@Override
	@Transactional(readOnly = true)
	public List<ENTITY> list() {
		return this.baseDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<ENTITY> list(Pageable pageable) {
		return this.baseDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<ENTITY> list(int start, int size) {
		return this.baseDao.findAll(PageRequest.of(start, size));
	}

	@Override
	public <S extends ENTITY> S save(S entity) {
		return this.baseDao.save(entity);

	}

	@Override
	public <S extends ENTITY> S update(S entity) {
		return this.baseDao.save(entity);
	}

	@Override
	public void delete(PK pk) {
		this.baseDao.deleteById(pk);
	}

}
