package com.project.book_my_show_oct24.Models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class ShowSeat extends BaseModel{

    private Show show;
    private Seat seat;
    private SeatStatus seatStatus;
}
