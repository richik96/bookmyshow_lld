package com.example.bookmyshow23.bookmyshow_lld.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel{

    @ManyToOne
    private Show show;

    @ManyToOne
    private SeatType seatType;
    private int price;
}
