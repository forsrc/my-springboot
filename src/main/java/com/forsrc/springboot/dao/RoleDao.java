package com.forsrc.springboot.dao;

import java.util.List;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.forsrc.springboot.entity.Role;
import com.forsrc.springboot.entity.RolePk;

@Repository("roleDao")
@RepositoryRestResource(collectionResourceRel = "/rest", path = "role")
public interface RoleDao extends BaseDao<Role, RolePk> {

	List<Role> findByUsername(String username);

	void deleteByUsername(String username);
}
