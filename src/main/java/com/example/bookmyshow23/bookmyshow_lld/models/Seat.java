package com.example.bookmyshow23.bookmyshow_lld.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private String number;
    private SeatType seatType;
    private int rowNum;
    private int colNum;

}
