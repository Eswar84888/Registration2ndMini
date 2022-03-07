package org.project.repositories;

import java.io.Serializable;
import java.util.List;

import org.project.entities.CityEntity;
import org.project.entities.CountryEntity;
import org.project.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<CountryEntity, Serializable >{
	
	// public List<UserEntity> findByUserId(Integer userId);
}
