package com.shubham.basiccrudapi.service;

import com.shubham.basiccrudapi.model.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    private final Map<UUID, User> userMap = new HashMap<>();

    // Create User
    public User createUser(User user) {
        UUID id = UUID.randomUUID();
        user.setId(id);
        userMap.put(id, user);
        return user;
    }

    // Get All Users
    public List<User> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }

    // Get User By ID
    public User getUserById(UUID id) {
        return userMap.get(id);
    }

    // Update User
    public User updateUser(UUID id, User updatedUser) {
        if (userMap.containsKey(id)) {
            updatedUser.setId(id);
            userMap.put(id, updatedUser);
            return updatedUser;
        }
        return null;
    }

    // Delete User
    public boolean deleteUser(UUID id) {
        return userMap.remove(id) != null;
    }
}