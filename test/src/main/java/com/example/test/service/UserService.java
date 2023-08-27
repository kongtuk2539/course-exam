package com.example.test.service;

import lombok.RequiredArgsConstructor;
import com.example.test.model.request.UserEntity;
import com.example.test.model.request.UserRequest;
import org.springframework.stereotype.Service;
import com.example.test.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public UserEntity addUser(UserRequest request){
        UserEntity userentity = new UserEntity();
        userentity.setFirstname(request.getFirstname());
        userentity.setLastname(request.getLastname());
        userentity.setPhone(request.getPhone());

        userRepository.save(userentity);

        return userentity;
    }
}
