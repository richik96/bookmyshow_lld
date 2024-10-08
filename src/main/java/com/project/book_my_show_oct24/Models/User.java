package com.project.book_my_show_oct24.Models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Data
@Entity
public class User extends BaseModel{

    private String name;
    private String email;
    private String password;

    @OneToMany
    private List<Booking> bookings;


}
