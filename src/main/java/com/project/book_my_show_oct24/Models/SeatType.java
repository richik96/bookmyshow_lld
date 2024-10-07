package com.project.book_my_show_oct24.Models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class SeatType extends BaseModel{

    private String name;

}
