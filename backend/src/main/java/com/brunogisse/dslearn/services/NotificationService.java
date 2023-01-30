package com.brunogisse.dslearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brunogisse.dslearn.dto.NotificationDTO;
import com.brunogisse.dslearn.entities.Notification;
import com.brunogisse.dslearn.entities.User;
import com.brunogisse.dslearn.repositories.NotificationRepository;

@Service
public class NotificationService {
	
	@Autowired
	private NotificationRepository repository;
	
	@Autowired
	private AuthService authService;
	
	@Transactional(readOnly = true)
	public Page<NotificationDTO> notificationForCurrentUser(Pageable pageable) {
		User user = authService.authenticated();
		Page<Notification> page = repository.findByUser(user, pageable);
		return page.map(x -> new NotificationDTO(x));
	}

}
