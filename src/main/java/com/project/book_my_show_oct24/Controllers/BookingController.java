package com.project.book_my_show_oct24.Controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.project.book_my_show_oct24.Models.Booking;
import com.project.book_my_show_oct24.Models.ResponseStatus;
import com.project.book_my_show_oct24.dtos.BookingMovieRequestDto;
import com.project.book_my_show_oct24.dtos.BookingMovieResponseDto;
import com.project.book_my_show_oct24.services.BookingService;

@Controller
public class BookingController {

    @Autowired
    private BookingService bookingService;
    

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }


    BookingMovieResponseDto bookMovie(BookingMovieRequestDto requestDto) {
        //DTO -> Data Transfer Objects
        
        BookingMovieResponseDto responseDto = new BookingMovieResponseDto();

        try {
            Booking booking= bookingService.bookMovie(
                                requestDto.getUserId(), 
                                requestDto.getShowId(), 
                                requestDto.getShowSeatId()
            );
            responseDto.setBookingId(booking.getId());
            responseDto.setAmount(booking.getPrice());
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);

        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }
}
