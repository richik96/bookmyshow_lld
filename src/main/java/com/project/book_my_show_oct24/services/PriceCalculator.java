package com.project.book_my_show_oct24.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.project.book_my_show_oct24.Models.Show;
import com.project.book_my_show_oct24.Models.ShowSeat;
import com.project.book_my_show_oct24.Models.ShowSeatType;
import com.project.book_my_show_oct24.repos.ShowSeatTypeRepository;




@Component
public class PriceCalculator {


    public ShowSeatTypeRepository showSeatTypeRepository;

    @Autowired
    public PriceCalculator(ShowSeatTypeRepository showSeatTypeRepository) {
        this.showSeatTypeRepository = showSeatTypeRepository;
    }


    public int calculatePrice(Show show, List<ShowSeat> seats) {

        // 1. Get the ShowSeatTypes for the input show
        // 2. Get the price for each ShowSeatType
        List<ShowSeatType> showSeatTypes = showSeatTypeRepository.findAllByShow(show);

        int amount = 0;
        for(ShowSeat seat: seats) {
            for(ShowSeatType showSeatType: showSeatTypes) {
                if(seat.getSeat().getSeatType().equals(showSeatType.getSeatType())) {
                    amount += showSeatType.getPrice();
                    break;
                }
            }
        }
        return amount;
    }
}
