package org.project.repositories;

import java.io.Serializable;
import java.util.List;

import org.project.entities.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<CityEntity, Serializable> {
 public List<CityEntity> findByStateId(Integer stateId);
}
                                                                                                                                                                                                                                                 