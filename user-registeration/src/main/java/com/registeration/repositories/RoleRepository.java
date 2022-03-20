package com.registeration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registeration.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
