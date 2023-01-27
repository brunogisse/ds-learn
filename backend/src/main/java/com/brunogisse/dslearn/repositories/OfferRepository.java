package com.brunogisse.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunogisse.dslearn.entities.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {

}
