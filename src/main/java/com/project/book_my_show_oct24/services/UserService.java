package com.project.book_my_show_oct24.services;

import java.util.ArrayList;
import java.util.Optional;

import com.project.book_my_show_oct24.Models.User;
import com.project.book_my_show_oct24.exceptions.InvalidUserException;
import com.project.book_my_show_oct24.repos.UserRepository;

public class UserService {


    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signUp(String emailId, String password) throws InvalidUserException {
        Optional<User> optionalUser = userRepository.findByEmail(emailId);
        if(optionalUser.isPresent()) {
            login(emailId, password);
        }
        //if not present then we are signing up the user
        User user = new User();
        user.setBookings(new ArrayList<>());
        user.setEmail(emailId);
        user.setPassword(password);
        //save the user to the DB
        userRepository.save(user);
    }

    public User login(String emailId, String password) {
        return null;
    }
}
