package com.project.book_my_show_oct24.Models;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Screen extends BaseModel{

    private String name;

    @OneToMany
    private List<Seat> seats;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection                              //basically represents list of enums
    private List<ScreenFeatures> screenFeatures;
}
