package com.project.book_my_show_oct24.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.book_my_show_oct24.Models.ShowSeat;




@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long>{

    Optional<ShowSeat> findById(Long showSeatId);           //optional class prevents a empty object to throw null point exception by isPresent() method
}
