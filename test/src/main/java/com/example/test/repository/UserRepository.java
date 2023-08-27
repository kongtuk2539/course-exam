package com.example.test.repository;


import com.example.test.model.request.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<UserEntity, Long> {

}
