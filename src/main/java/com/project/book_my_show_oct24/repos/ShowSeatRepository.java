package com.project.book_my_show_oct24.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.book_my_show_oct24.Models.ShowSeat;




@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long>{

    @Override         //optional class prevents a empty object to throw null point exception by isPresent() method
    List<ShowSeat> findAllById(Iterable<Long> longs);

    @Override
    ShowSeat save(ShowSeat showSeat);
    // 2 ways --> insert + update
    // if id is present in the object, it will update the object
    // if id is not present in the object, it will insert the object
    // return type is the object itself
}
