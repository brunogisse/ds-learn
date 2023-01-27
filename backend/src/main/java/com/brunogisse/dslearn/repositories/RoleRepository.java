package com.brunogisse.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunogisse.dslearn.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
