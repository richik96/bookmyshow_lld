package com.project.book_my_show_oct24.Controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.book_my_show_oct24.Models.ResponseStatus;
import com.project.book_my_show_oct24.Models.User;
import com.project.book_my_show_oct24.dtos.SignUpRequestDto;
import com.project.book_my_show_oct24.dtos.SignUpResponseDto;
import com.project.book_my_show_oct24.exceptions.InvalidUserException;
import com.project.book_my_show_oct24.services.UserService;

public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    public SignUpResponseDto signUp(SignUpRequestDto requestDto) throws InvalidUserException {

        User user = userService.signUp(requestDto.getEmail(), requestDto.getPassword());
        SignUpResponseDto responseDto = new SignUpResponseDto();

        try {
            user = userService.signUp(requestDto.getEmail(), requestDto.getPassword());
            responseDto.setUserId(user.getId());
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            responseDto.setUserId(-1L);
        }

        return responseDto;
    }
}
