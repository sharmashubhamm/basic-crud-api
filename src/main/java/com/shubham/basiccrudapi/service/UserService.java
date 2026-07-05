package com.shubham.basiccrudapi.service;

import com.shubham.basiccrudapi.exception.ResourceNotFoundException;
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

        User user = userMap.get(id);

        if (user == null) {
            throw new ResourceNotFoundException("User not found with id: " + id);
        }

        return user;
    }

    // Update User
    public User updateUser(UUID id, User updatedUser) {

        if (!userMap.containsKey(id)) {
            throw new ResourceNotFoundException("User not found with id: " + id);
        }

        updatedUser.setId(id);
        userMap.put(id, updatedUser);

        return updatedUser;
    }

    // Delete User
    public void deleteUser(UUID id) {

        if (!userMap.containsKey(id)) {
            throw new ResourceNotFoundException("User not found with id: " + id);
        }

        userMap.remove(id);
    }
}