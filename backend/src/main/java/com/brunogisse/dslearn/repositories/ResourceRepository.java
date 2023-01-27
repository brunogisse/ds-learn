package com.brunogisse.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunogisse.dslearn.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
