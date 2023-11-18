package com.example.bookmyshow23.bookmyshow_lld.models;

import org.hibernate.mapping.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class User extends BaseModel{
    private String name;
    private String email;
    private List<Booking> bookings;
}
