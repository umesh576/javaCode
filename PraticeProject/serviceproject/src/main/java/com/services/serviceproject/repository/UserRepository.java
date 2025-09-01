package com.services.serviceproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.services.serviceproject.model.*;

public interface UserRepository extends JpaRepository<User, Long> {
}