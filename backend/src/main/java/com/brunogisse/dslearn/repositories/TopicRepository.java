package com.brunogisse.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunogisse.dslearn.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
