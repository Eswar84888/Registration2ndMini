package org.project.repositories;

import java.io.Serializable;

import org.project.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends  JpaRepository<UserEntity, Serializable> {

public UserEntity findByUserEmail(String email);


}
