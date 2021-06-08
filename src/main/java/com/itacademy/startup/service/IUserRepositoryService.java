package com.itacademy.startup.service;

import com.itacademy.startup.entity.User;
import com.itacademy.startup.entity.UserRepository;

import java.util.List;

public interface IUserRepositoryService {

  public List<UserRepository> getAllUserRepositories();
  public UserRepository saveUserRepository(UserRepository userRepository);
  public UserRepository getUserRepositoryById(String userRepositoryId);
}
