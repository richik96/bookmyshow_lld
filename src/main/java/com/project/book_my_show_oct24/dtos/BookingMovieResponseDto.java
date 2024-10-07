package com.project.book_my_show_oct24.dtos;
import com.project.book_my_show_oct24.Models.ResponseStatus;

import lombok.Data;

@Data
public class BookingMovieResponseDto {


    private int amount;
    private Long bookingId;
    private ResponseStatus responseStatus;

}
