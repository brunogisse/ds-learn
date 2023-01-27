package com.brunogisse.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunogisse.dslearn.entities.Section;

public interface SectionRepository extends JpaRepository<Section, Long> {

}
