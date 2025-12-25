package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.UserProfile;
import com.example.demo.repository.UserProfileRepository;
import com.example.demo.service.UserProfileService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    private final UserProfileRepository repo;

    public UserProfileServiceImpl(UserProfileRepository repo) {
        this.repo = repo;
    }

    @Override
    public UserProfile createUser(UserProfile user) throws Exception {
        repo.findAll().stream()
            .filter(u -> u.getEmail().equals(user.getEmail()))
            .findFirst()
            .ifPresent(u -> { throw new RuntimeException("Email already exists"); });
        return repo.save(user);
    }

    @Override
    public UserProfile updateUser(Long id, UserProfile user) throws Exception {
        UserProfile existing = getUserById(id);
        existing.setFullName(user.getFullName());
        existing.setEmail(user.getEmail());
        existing.setActive(user.isActive());
        return repo.save(existing);
    }

    @Override
    public UserProfile getUserById(Long id) throws Exception {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("UserProfile not found"));
    }

    @Override
    public List<UserProfile> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public void deactivateUser(Long id) throws Exception {
        UserProfile existing = getUserById(id);
        existing.setActive(false);
        repo.save(existing);
    }
}
// package com.example.demo.service.Impl;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import java.util.List;
// import com.example.demo.service.UserProfileService;
// import com.example.demo.repository.UserProfileRepository;
// import com.example.demo.model.UserProfile;
// import com.example.demo.exception.ResourceNotFoundException;
// import com.example.demo.exception.DuplicateResourceException;


// @Service
// public class UserProfileServiceImpl implements UserProfileService{
//     private final UserProfileRepository upr;
//     public UserProfileServiceImpl(UserProfileRepository upr){
//         this.upr=upr;
//     }
//     public UserProfile createUser(UserProfile user){
//         if(upr.existsByEmail(user.getEmail())){
//             throw new RuntimeException("Email already exists");
//         }
//         return upr.save(user);
//     }
// //     public UserProfile createUser(UserProfile user) {
// //     if (upr.existsByEmail(user.getEmail())) {
// //         throw new DuplicateResourceException("Email already exists");
// //     }
// //     return upr.save(user);
// // }

// // public UserProfile getUserById(Long id) {
// //     return upr.findById(id)
// //             .orElseThrow(() -> new ResourceNotFoundException("UserProfile not found with id " + id));
// // }

//     public UserProfile updateUser(Long id,UserProfile user){
//         UserProfile existing=upr.findById(id).orElseThrow(()->new RuntimeException("UserProfile not found"));

//         existing.setUsername(user.getUsername());
//         existing.setEmail(user.getEmail());

//         return upr.save(existing); 
//     }
//     public UserProfile getUserById(Long id){
//         return upr.findById(id).orElseThrow(()->new RuntimeException("UserProfile not found"));
//     }
//     public List<UserProfile> getAllUsers(){
//         return upr.findAll();
//     }
//     public void deactivateUser(Long id){
//         UserProfile user=upr.findById(id).orElseThrow(()->new RuntimeException("UserProfile not found"));
//         user.setActive(false);
//         upr.save(user);
//     }
// }
