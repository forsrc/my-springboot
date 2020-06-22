package com.forsrc.springboot.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.forsrc.springboot.entity.User;

@Repository("userDao")
@RepositoryRestResource(collectionResourceRel = "/rest", path = "user")
@Primary
public interface UserDao extends BaseDao<User, String> {
}
