package com.forsrc.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;


@NoRepositoryBean
public interface BaseDao<ENTITY, PK> extends JpaRepository<ENTITY, PK>, PagingAndSortingRepository<ENTITY, PK> {

}
