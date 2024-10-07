package com.project.book_my_show_oct24.Models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity(name = "shows")         //custom table name
public class Show extends BaseModel{

    @ManyToOne
    private Movie movie;


    private Date startTime;
    private Date endTime;

    @ManyToOne
    private Screen screen;

    
}
