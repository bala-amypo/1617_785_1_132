// package com.example.demo.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
// import com.example.demo.model.UserProfile;

// public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
// }

package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long>{
    boolean existsByEmail(String email);
}
