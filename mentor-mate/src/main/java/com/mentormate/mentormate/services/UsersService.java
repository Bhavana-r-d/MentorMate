package com.mentormate.mentormate.services;

import java.util.List;

import com.mentormate.mentormate.entities.Users;

public interface UsersService {

	Users createUsers(Users user);

	Users updateUsers(Users user);

	Users getUserById(long userId);

	List<Users> getAll();

}