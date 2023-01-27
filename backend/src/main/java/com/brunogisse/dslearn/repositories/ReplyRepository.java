package com.brunogisse.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunogisse.dslearn.entities.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

}
