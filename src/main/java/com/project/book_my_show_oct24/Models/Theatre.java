package com.project.book_my_show_oct24.Models;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Theatre extends BaseModel{

    private String name;
    private Region region;
    private List<Screen> screens;


}
