package com.ttodampartners.ttodamttodam.domain.user.repository;

import com.ttodampartners.ttodamttodam.domain.user.entity.UserEntity;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
  Optional<UserEntity> findByEmail(String email);
  Optional<UserEntity> findByNickname(String nickname);
  Optional<UserEntity> findByPhone(String phone);

  boolean existsByEmail(String email);
  boolean existsByPhone(String phone);
  boolean existsByNickname(String nickname);

  @Query("SELECT DISTINCT r.requestUser FROM request r " +
          "WHERE r.post.postId = :postId AND r.requestStatus = 'ACCEPT'")
  List<UserEntity> findAcceptedRequestUsersByPostId(Long postId);
}
