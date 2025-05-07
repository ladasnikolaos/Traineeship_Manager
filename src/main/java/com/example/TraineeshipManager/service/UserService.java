package com.example.TraineeshipManager.service;

import org.springframework.stereotype.Service;

import com.example.TraineeshipManager.model.User;

public interface UserService {
	public void saveUser(User user);
    public boolean isUserPresent(User user);
}
