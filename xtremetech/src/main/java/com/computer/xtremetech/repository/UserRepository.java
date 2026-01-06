
package com.computer.xtremetech.repository;

import com.computer.xtremetech.entity.UserEntity; // ඔබේ Entity එකේ නම
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserRepository, Long> {
    Optional<UserEntity> findByEmail(String email);
    Optional<UserEntity> findByUserId(String userId);
}