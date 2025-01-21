package com.example.TekarchDataStoreMS.Repositories;

import com.example.TekarchDataStoreMS.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface UserServiceRepositories extends JpaRepository<User,Long> {
    User findByuserId(Long userId);
   // User setUserByuserId(Long userId);
    void deleteUserByuserId(Long userId);
}
