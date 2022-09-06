package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Role;
import com.inti.repositories.RoleRepository;
import com.inti.service.interfaces.IRoleService;

@Service
public class RoleService implements IRoleService {
	@Autowired
	RoleRepository RoleRepository;

	@Override
	public List<Role> findAll() {
		return RoleRepository.findAll();
	}

	@Override
	public Role save(Role Role) {
		return RoleRepository.save(Role);
	}

	@Override
	public void delete(Long id) {
		RoleRepository.deleteById(id);

	}

}
