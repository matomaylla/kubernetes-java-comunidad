package com.matomaylla.demoPod.service;

import com.matomaylla.demoPod.model.User;
import com.matomaylla.demoPod.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public String obtenerNombre(){
        User user = userRepository.findRandomUser();
        return user.getName();
    }
}
