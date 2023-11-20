package com.example.bookmyshow23.bookmyshow_lld.models;

import org.hibernate.mapping.List;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Region extends BaseModel{
    private String name;
    private List<Theatre> theatre;
     
}
