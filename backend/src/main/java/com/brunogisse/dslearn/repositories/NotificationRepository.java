package com.brunogisse.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunogisse.dslearn.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
