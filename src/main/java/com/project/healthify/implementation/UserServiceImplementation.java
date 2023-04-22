package com.project.healthify.implementation;

import com.project.healthify.model.User;
import com.project.healthify.repository.UserRepository;
import com.project.healthify.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> get(String id) {
        return userRepository.findById(id);
    }

    @Override
    public void create(User entity) {
        userRepository.save(entity);
    }

    @Override
    public void save(User entity) {
        userRepository.save(entity);
    }

    @Override
    public void delete(String id) {
        userRepository.deleteById(id);
    }

}
