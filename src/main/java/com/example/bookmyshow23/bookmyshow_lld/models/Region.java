package com.example.bookmyshow23.bookmyshow_lld.models;

import org.hibernate.mapping.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Region extends BaseModel{
    private String name;
    private List<String> actors;
     
}
