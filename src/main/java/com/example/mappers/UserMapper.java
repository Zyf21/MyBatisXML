package com.example.mappers;

import com.example.entities.UserEntity;

import java.util.List;

public interface UserMapper {


    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);

}
