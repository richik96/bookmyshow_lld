package com.project.book_my_show_oct24.Models;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Show extends BaseModel{

    private Movie movie;
    private Date startTime;
    private Date endTime;
    private Screen screen;

    
}
