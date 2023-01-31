package com.brunogisse.dslearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brunogisse.dslearn.dto.DeliverRevisionDTO;
import com.brunogisse.dslearn.entities.Deliver;
import com.brunogisse.dslearn.repositories.DeliveryRepository;

@Service
public class DeliverService {
	
	@Autowired
	private DeliveryRepository repository;
	
	@Transactional
	public void saveRevision(Long id, DeliverRevisionDTO dto) {
		Deliver deliver = repository.getOne(id);
		deliver.setStatus(dto.getStatus());
		deliver.setFeedback(dto.getFeedback());
		deliver.setCorrectCount(dto.getCorrectCount());
		repository.save(deliver);
	}
}
