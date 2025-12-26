// package com.example.demo.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
// import com.example.demo.model.UserProfile;
// import org.springframework.stereotype.Repository;

// @Repository
// public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
// }
package com.example.demo.repository;

import com.example.demo.model.UserProfile;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserProfileRepository  extends JpaRepository<UserProfile, Long> {
    UserProfile save(UserProfile userProfile);
    UserProfile findById(Long id);
    UserProfile findByEmail(String email);
    boolean existsByEmail(String email);
}