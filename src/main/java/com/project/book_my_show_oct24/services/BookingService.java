package com.project.book_my_show_oct24.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.book_my_show_oct24.Models.Booking;
import com.project.book_my_show_oct24.Models.SeatStatus;
import com.project.book_my_show_oct24.Models.Show;
import com.project.book_my_show_oct24.Models.ShowSeat;
import com.project.book_my_show_oct24.Models.User;
import com.project.book_my_show_oct24.exceptions.InvalidShowException;
import com.project.book_my_show_oct24.exceptions.InvalidShowSeatException;
import com.project.book_my_show_oct24.exceptions.InvalidUserException;
import com.project.book_my_show_oct24.repos.ShowRepository;
import com.project.book_my_show_oct24.repos.ShowSeatRepository;
import com.project.book_my_show_oct24.repos.UserRepository;

import jakarta.transaction.Transactional;


@Service
public class BookingService {

    private UserRepository userRepository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;

    
    @Autowired
    public BookingService(UserRepository userRepository, ShowRepository showRepository,
            ShowSeatRepository showSeatRepository) {
        this.userRepository = userRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
    }

    public Booking bookMovie(Long userId, Long showId, List<Long> showSeatIds) throws InvalidUserException, InvalidShowException, InvalidShowSeatException {

        //1. Check if the user exists
        //2. Check if the show exists
        // ---------- TAKE A LOCK------------
        //3. Check if the show seats are available. if not create a custom exception
        //4. if yes, mark the seat status as blocked and save it in database
        // ---------- RELEASE THE LOCK------------
        //5. create a booking object with pending status and save it in the database
        //6. return the booking object
        Optional<User> optionalUser = userRepository.findById(userId);
        if(optionalUser.isEmpty()) {
            throw new InvalidUserException("User not found");
        }
        User user = optionalUser.get();

        Optional<Show> optionalShow = showRepository.findById(showId);
        if(optionalShow.isEmpty()) {
            throw new InvalidShowException("Show not found");
        }
        Show show = optionalShow.get();                 //getting show object

        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatIds);     //unlike user and show, showseat is a list and list can only be empty not NULL
        for(ShowSeat showSeat : showSeats) {
            if(showSeat.getSeatStatus().equals(SeatStatus.UNAVAILABLE)) {
                throw new InvalidShowSeatException("Show seat not available");
            }
        }

        List<ShowSeat> finalShowSeats = new ArrayList<>();

        for (ShowSeat showSeat : showSeats) {
            showSeat.setSeatStatus(SeatStatus.BLOCKED);         // if available, blocking the seat in DB
            //save the data in DB
            finalShowSeats.add(showSeatRepository.save(showSeat));
        }
        return null;
    }
}
