package com.UserActivation.Repo;

import com.UserActivation.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByEmailIdIgnoreCase(String emailId);
}