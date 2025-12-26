// package com.example.demo.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
// import com.example.demo.model.User;

// import java.util.Optional;
// import org.springframework.stereotype.Repository;

// @Repository
// public interface UserRepository extends JpaRepository<User, Long> {
//     Optional<User> findByEmail(String email);
// }

package com.example.demo.repository;

import com.example.demo.model.UserProfile;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository  extends JpaRepository<AppUser, Long> {
    UserProfile save(UserProfile userProfile);
    UserProfile findById(Long id);
    UserProfile findByEmail(String email);
    boolean existsByEmail(String email);
}