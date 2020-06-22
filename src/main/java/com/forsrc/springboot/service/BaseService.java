package com.forsrc.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
@Transactional(rollbackFor = { Exception.class })
public interface BaseService<ENTITY, PK> {

	@Transactional(readOnly = true)
	ENTITY get(PK pk);


	@Transactional(readOnly = true)
	List<ENTITY> list();

	@Transactional(readOnly = true)
	Page<ENTITY> list(Pageable pageable);

	@Transactional(readOnly = true)
	Page<ENTITY> list(int start, int size);

	
	<S extends ENTITY> S save(S entity);

	<S extends ENTITY> S update(S entity);

	void delete(PK pk);
}
