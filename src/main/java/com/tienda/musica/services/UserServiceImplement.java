package com.tienda.musica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.musica.models.User;
import com.tienda.musica.interfaces.UserRepository;

@Service
public class UserServiceImplement implements UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserServiceImplement(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @SuppressWarnings("null")
    public User save(User user) {
        return userRepository.save(user);
    }

    @SuppressWarnings("null")
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @SuppressWarnings("null")
    public void delete(User user) {
        userRepository.delete(user);
    }    
}
