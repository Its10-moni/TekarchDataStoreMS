package com.example.TekarchDataStoreMS.Controller;

import com.example.TekarchDataStoreMS.Models.User;
import com.example.TekarchDataStoreMS.Repositories.UserServiceRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/datastore")
public class UserServiceController {
    @Autowired
    private UserServiceRepositories UserServiceRepository;
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return UserServiceRepository.save(user);
    }

    @GetMapping("/users/{userId}")
    public User getUserByuserId(@PathVariable Long userId) {
        return UserServiceRepository.findByuserId(userId);
    }
    @GetMapping("/users")
    public List<User> getUsers() {
        return UserServiceRepository.findAll();
    }

    @PutMapping("/users/{userId}")
    public User updateUserByUserId(@PathVariable Long userId, @RequestBody User user) {
        user.setUserId(userId);
        return UserServiceRepository.save(user);
    }

    @DeleteMapping("/users/{userid}")
    public void deleteUserByUserId(@PathVariable Long userId) {
        UserServiceRepository.deleteUserByuserId(userId);
    }
}
