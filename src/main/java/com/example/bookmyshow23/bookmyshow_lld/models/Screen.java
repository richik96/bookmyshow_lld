package com.example.bookmyshow23.bookmyshow_lld.models;

import org.hibernate.mapping.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Screen extends BaseModel{
    private String name;
    private List<Seat> seats;
    private List<ScreenFeatures> screenFeatures;
    

}
