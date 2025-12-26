// package com.example.demo.service.impl;

// import com.example.demo.exception.ResourceNotFoundException;
// import com.example.demo.exception.EmailAlreadyExistsException;
// import com.example.demo.model.User;
// import com.example.demo.repository.UserRepository;
// import com.example.demo.service.UserService;
// import org.springframework.stereotype.Service;

// @Service
// public class UserServiceImpl implements UserService {

//     private final UserRepository repo;

//     public UserServiceImpl(UserRepository repo) {
//         this.repo = repo;
//     }

//     @Override
//     public User register(User user) throws Exception {
//         if (repo.findByEmail(user.getEmail()).isPresent()) {
//             throw new EmailAlreadyExistsException("Email already exists");
//         }
//         return repo.save(user);
//     }

//     @Override
//     public User findByEmail(String email) throws Exception {
//         return repo.findByEmail(email)
//                 .orElseThrow(() -> new ResourceNotFoundException("User not found"));
//     }
// }
package com.example.demo.service.impl;

import com.example.demo.model.AppUser;
import com.example.demo.repository.AppUserRepository;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final AppUserRepository appUserRepository;

    public UserServiceImpl(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public AppUser findByEmail(String email) {
        return appUserRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
