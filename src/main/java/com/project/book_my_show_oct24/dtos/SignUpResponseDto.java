package com.project.book_my_show_oct24.dtos;

import com.project.book_my_show_oct24.Models.ResponseStatus;
import lombok.Data;



@Data
public class SignUpResponseDto {

    private ResponseStatus responseStatus;
    private Long userId;

}
