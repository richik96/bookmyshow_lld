package com.project.book_my_show_oct24.Models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Screen extends BaseModel{

    private String name;

    @OneToMany
    private List<Seat> seats;
    
    private List<ScreenFeature> screenFeatures;
    private ScreenFeature screenFeature;
}
