// package com.example.demo.service;

// import com.example.demo.model.User;

// public interface UserService {
//     User register(User user) throws Exception;
//     User findByEmail(String email) throws Exception;
// }
package com.example.demo.service;

import com.example.demo.model.AppUser;

public interface UserService {

    AppUser findByEmail(String email);
}
