package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Role;
import com.inti.service.interfaces.IRoleService;

@RestController
@CrossOrigin
public class RoleController {
	@Autowired
	IRoleService RoleService;

	@GetMapping("/Roles")
	public List<Role> findAll() {
		return RoleService.findAll();
	}

	@PostMapping("/Roles")
	public Role saveRole(@RequestBody Role Role) {
		return RoleService.save(Role);
	}

	@DeleteMapping("/Roles/{id}")
	public void deleteRole(@PathVariable("id") Long id) {
		RoleService.delete(id);
	}

}
