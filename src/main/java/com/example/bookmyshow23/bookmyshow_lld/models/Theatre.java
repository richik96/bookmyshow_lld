package com.example.bookmyshow23.bookmyshow_lld.models;

import org.hibernate.mapping.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Theatre extends BaseModel{
    private String name;
    private Region region;
    private List<Screen> screens;

    
}
