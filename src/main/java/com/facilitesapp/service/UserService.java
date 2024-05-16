package com.facilitesapp.service;

import com.facilitesapp.model.UserEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService   {
    Optional<UserEntity> findById(Integer userId);
}
