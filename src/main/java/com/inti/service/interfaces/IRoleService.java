package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Role;

public interface IRoleService {
	List<Role> findAll();

	Role save(Role Role);

	void delete(Long id);
	
	Role findOne(Long id);

	Role findByLibelle(String libelle);

}
