package com.SecurityConfig;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, int> {
 User findByUsername(String username);
}
