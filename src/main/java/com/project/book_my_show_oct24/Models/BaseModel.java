package com.project.book_my_show_oct24.Models;

import java.util.Date;



import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data

@MappedSuperclass
public class BaseModel {

    @Id                 //tells ORM that this is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // 1st row will be id 1, 2nd row = id-2....

    private Long id;
    private Date createdAt;
    private Date updatedAt;

}
