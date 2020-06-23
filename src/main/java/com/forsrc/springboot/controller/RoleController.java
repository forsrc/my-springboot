package com.forsrc.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forsrc.springboot.entity.Role;
import com.forsrc.springboot.service.RoleService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@GetMapping("/{username}")
	private Flux<List<Role>> get(@PathVariable String username) {

		return Flux.just(this.roleService.findByUsername(username));
	}

	@GetMapping("/test/{username}")
	private Flux<List<Role>> getByUsername(@PathVariable String username) {

		return Flux.just(this.roleService.getByUsername(username));
	}

	@GetMapping
	private Flux<List<Role>> list() {

		return Flux.just(this.roleService.list());
	}

	@PostMapping()
	private Mono<Role> save(@RequestBody Role user) {
		return Mono.just(this.roleService.save(user));
	}

	@PutMapping()
	private Mono<Role> update(@RequestBody Role user) {
		return Mono.just(this.roleService.update(user));
	}

	@DeleteMapping("/{username}")
	private Mono<String> delete(@PathVariable String username) {
		this.roleService.deleteByUsername(username);
		return Mono.just(String.format("delete %s", username));
	}


}
