package com.example.bookmyshow23.bookmyshow_lld.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    private Movie movie;
    private Date endTime;
    private Date startTime;
    private Screen screen;
    
}
