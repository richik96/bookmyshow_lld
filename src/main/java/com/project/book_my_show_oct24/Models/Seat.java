package com.project.book_my_show_oct24.Models;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Seat {

    private String number;

    @ManyToOne
    private SeatType seatType;
    
    private int rowNum;
    private int colNum;

}
