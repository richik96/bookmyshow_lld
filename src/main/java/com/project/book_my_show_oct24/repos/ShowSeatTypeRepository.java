package com.project.book_my_show_oct24.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.book_my_show_oct24.Models.Show;
import com.project.book_my_show_oct24.Models.ShowSeatType;


@Repository
public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatTypeRepository, Long>{

    @Override
    List<ShowSeatType> findAllByShow(Show show);
}
