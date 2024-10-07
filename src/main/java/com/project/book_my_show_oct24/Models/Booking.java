package com.project.book_my_show_oct24.Models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity             //signals ORM to map this to a table in DB
public class Booking extends BaseModel{

    @ManyToMany         //1 booking can have many seats. on certain conditions, 1 seat can have many bookings
    private List<Seat> seats;

    @ManyToOne          //1 booking can have 1 show. 1 show will have many booking
    private Show show;

    @OneToMany          //1 booking can have many payment option. 1 payment can do 1 booking only
    private List<Payment> payments;
    private BookingStatus bookingStatus;

    @ManyToOne          //1booking can belong to 1 user. 1 user can do many booking
    private User user;
    private int price;
    private Date timeOfBooking;

}
