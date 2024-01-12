package com.example.bookmyshow23.bookmyshow_lld.models;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass

public class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //1st row will have id as 1, 2nd row will have id as 2 and so on
    private Long id;
    private Date createdAt;
    private Date updatedAt;

    
}
