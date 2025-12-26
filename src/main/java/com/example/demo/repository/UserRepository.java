package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.User;

import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
// package com.example.demo.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
// import java.util.Optional;
// import com.example.demo.model.User;
// import org.springframework.stereotype.Repository;

// @Repository
// public interface UserRepository extends JpaRepository<User, Long> {
//     Optional<User> findByEmail(String email);
// }
 