package com.marketplace.marketplaceapp.service;

import com.marketplace.marketplaceapp.entitiy.User;
import com.marketplace.marketplaceapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }

    public Iterable<User> getUserList() {
        return userRepository.getAllByUsernameNotNull();
    }

    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }



}
