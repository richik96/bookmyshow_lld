package com.project.book_my_show_oct24.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.book_my_show_oct24.Models.Show;



@Repository
public interface ShowRepository extends JpaRepository<Show, Long>{

    
}
