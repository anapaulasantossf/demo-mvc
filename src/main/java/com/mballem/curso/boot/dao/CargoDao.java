package com.mballem.curso.boot.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mballem.curso.boot.domain.Cargo;
import com.mballem.curso.boot.domain.Departamento;

@Repository
public interface CargoDao {
	
	void save(Cargo cargo);
	
	void update(Cargo cargo);
	
	void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();

}
