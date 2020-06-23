package com.forsrc.springboot.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.forsrc.springboot.entity.Role;

@Mapper
public interface RoleMapper {

	public List<Role> getByUsername(@Param("username") String username);
}
