package com.example.bookmyshow23.bookmyshow_lld.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel{
    private Show show;
    private SeatType seatType;
    private int price;
}
