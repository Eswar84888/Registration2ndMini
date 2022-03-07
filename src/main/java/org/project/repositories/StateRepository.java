package org.project.repositories;

import java.io.Serializable;
import java.util.List;

import org.project.entities.StateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<StateEntity, Serializable> {
	public List<StateEntity> findByCountryId(Integer countryId);

}
