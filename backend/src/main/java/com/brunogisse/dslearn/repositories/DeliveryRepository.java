package com.brunogisse.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunogisse.dslearn.entities.Deliver;

public interface DeliveryRepository extends JpaRepository<Deliver, Long> {

}
