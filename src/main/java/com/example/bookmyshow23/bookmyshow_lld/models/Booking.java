package com.example.bookmyshow23.bookmyshow_lld.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Date;

@Getter
@Setter
@Entity

public class Booking extends BaseModel{

    @ManyToMany
    private List<Seat> seats;

    @ManyToOne
    private Show show;

    @OneToMany
    private List<Payment> payments;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private BookingStatus bookingStatus;

    @ManyToOne
    private User user;

    private int price;
    private Date timeOfBooking;
}
