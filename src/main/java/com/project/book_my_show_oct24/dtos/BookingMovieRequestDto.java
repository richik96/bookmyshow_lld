package com.project.book_my_show_oct24.dtos;

import java.util.List;

import lombok.Data;

@Data
public class BookingMovieRequestDto {

    private Long userId;
    private Long showId;
    private List<Long> showSeatId;

}
