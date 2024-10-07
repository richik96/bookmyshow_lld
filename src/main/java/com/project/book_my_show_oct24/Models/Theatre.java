package com.project.book_my_show_oct24.Models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Theatre extends BaseModel{

    private String name;

    @ManyToOne
    private Region region;

    @OneToMany
    private List<Screen> screens;


}
