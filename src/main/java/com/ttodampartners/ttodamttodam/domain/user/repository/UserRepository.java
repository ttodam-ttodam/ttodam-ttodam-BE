package com.ttodampartners.ttodamttodam.domain.user.repository;

import com.ttodampartners.ttodamttodam.domain.user.entity.UserEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
  Optional<UserEntity> findByEmail(String email);
  boolean existsByEmail(String email);
  boolean existsByPhone(String phone);
  boolean existsByNickname(String nickname);
}