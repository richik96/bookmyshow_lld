package com.example.bookmyshow23.bookmyshow_lld.models;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.mapping.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

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
    private BookingStatus bookingStatus;

    @ManyToOne
    private User user;
    
    private int price;
    private Date timeOfBooking;
}
