package com.tienda.musica.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.musica.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
