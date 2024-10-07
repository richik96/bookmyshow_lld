package com.project.book_my_show_oct24.Models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Region extends BaseModel{

    private String name;

    @OneToMany          //1 region can have multiple theatres. 1 theatre can be at 1 region only
    private List<Theatre> theatres;

}
