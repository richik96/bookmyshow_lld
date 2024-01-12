package com.example.bookmyshow23.bookmyshow_lld.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity(name = "shows")


public class Show extends BaseModel{

    @ManyToOne
    private Movie movie;

    private Date endTime;
    private Date startTime;

    @ManyToOne
    private Screen screen;
    
}
