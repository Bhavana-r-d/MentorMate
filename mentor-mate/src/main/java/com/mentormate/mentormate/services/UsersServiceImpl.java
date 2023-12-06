package com.mentormate.mentormate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mentormate.mentormate.repositories.UsersRepo;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UsersServiceImpl {
 @Autowired
 UsersRepo userRepo;
}
