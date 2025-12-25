// package com.example.demo.service;

// import com.example.demo.model.UserProfile;
// import java.util.List;

// public interface UserProfileService {
//     UserProfile createUser(UserProfile user) throws Exception;
//     UserProfile updateUser(Long id, UserProfile user) throws Exception;
//     UserProfile getUserById(Long id) throws Exception;
//     List<UserProfile> getAllUsers();
//     void deactivateUser(Long id) throws Exception;
// }
package com.example.demo.service;

import java.util.List;
import com.example.demo.model.UserProfile;

public interface UserProfileService{
    UserProfile createUser(UserProfile user);
    UserProfile updateUser(Long id,UserProfile user);
    UserProfile getUserById(Long id);
    List<UserProfile> getAllUsers();
    void deactivateUser(Long id);
}
