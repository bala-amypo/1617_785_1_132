// package com.example.demo.service.impl;

// import com.example.demo.exception.ResourceNotFoundException;
// import com.example.demo.model.UserProfile;
// import com.example.demo.exception.EmailAlreadyExistsException;
// import com.example.demo.repository.UserProfileRepository;
// import com.example.demo.service.UserProfileService;
// import org.springframework.stereotype.Service;
// import java.util.List;

// @Service
// public class UserProfileServiceImpl implements UserProfileService {

//     private final UserProfileRepository repo;

//     public UserProfileServiceImpl(UserProfileRepository repo) {
//         this.repo = repo;
//     }

//     @Override
//     public UserProfile createUser(UserProfile user) throws Exception {
//         repo.findAll().stream()
//             .filter(u -> u.getEmail().equals(user.getEmail()))
//             .findFirst()
//             .ifPresent(u -> { throw new EmailAlreadyExistsException("Email already exists"); });
//         return repo.save(user);
//     }

//     @Override
//     public UserProfile updateUser(Long id, UserProfile user) throws Exception {
//         UserProfile existing = getUserById(id);
//         existing.setFullName(user.getFullName());
//         existing.setEmail(user.getEmail());
//         existing.setActive(user.isActive());
//         return repo.save(existing);
//     }

//     @Override
//     public UserProfile getUserById(Long id) throws Exception {
//         return repo.findById(id)
//                 .orElseThrow(() -> new ResourceNotFoundException("UserProfile not found"));
//     }

//     @Override
//     public List<UserProfile> getAllUsers() {
//         return repo.findAll();
//     }

//     @Override
//     public void deactivateUser(Long id) throws Exception {
//         UserProfile existing = getUserById(id);
//         existing.setActive(false);
//         repo.save(existing);
//     }
// }
package com.example.demo.service.impl;

import com.example.demo.model.UserProfile;
import com.example.demo.service.UserProfileService;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Override
    public UserProfile createUser(UserProfile user) {
        return user;
    }

    @Override
    public UserProfile getUserById(Long id) {
        return new UserProfile();
    }

    @Override
    public void deactivateUser(Long id) {
    }
}
