package com.project.book_my_show_oct24.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

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

        //before we store the password to DB, we should encrypt it using BCrypt
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode(password));

        //save the user to the DB
        userRepository.save(user);
        return user;
    }

    public boolean login(String emailId, String password) {
        Optional<User> optionalUser = userRepository.findByEmail(emailId);

        String passwordStoredInDB = optionalUser.get().getPassword();
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        return bCryptPasswordEncoder.matches(password, passwordStoredInDB);
    }
}
