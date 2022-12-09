package com.interview.carmanagementinformationsystem.data.repositories;

import com.interview.carmanagementinformationsystem.data.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByEmail(String email);
}
