package com.tienda.musica.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.tienda.musica.models.User;

@Service
public interface UserService {
    
    public List<User> findAll();
    public User save(User user);
    public User findById(Long id);
    public void delete(User user);
}
