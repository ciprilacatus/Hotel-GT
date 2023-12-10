package com.gt.HotelGT.controller;

import com.gt.HotelGT.service.HotelReservation;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
@Controller
public class ReservationTracker {
    private HotelReservation rez;

    public void setRez(HotelReservation rez) {
        this.rez = rez;

    }
    public HotelReservation getRez(){
        return rez;
    }
}
