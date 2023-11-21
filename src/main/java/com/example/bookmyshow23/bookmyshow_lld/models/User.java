package com.example.bookmyshow23.bookmyshow_lld.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class User extends BaseModel{
    private String name;
    private String email;

    @OneToMany
    private List<Booking> bookings;
    
}
