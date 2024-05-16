package com.facilitesapp.service.impl;

import com.facilitesapp.model.UserEntity;
import com.facilitesapp.repository.UserRepository;
import com.facilitesapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserserviceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public Optional<UserEntity> findById(Integer useId) {
        Optional<UserEntity> userEntity = userRepository.findById(useId);
        return userEntity;
    }
}
