package com.gt.HotelGT.controller;

import com.gt.HotelGT.repository.HotelReservationRepository;
import com.gt.HotelGT.service.HotelReservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Set;

@Controller
public class ReservationController {

    @Autowired
    HotelReservationRepository resRepo;

    @GetMapping("/rez")
    public String hotelReservation(@ModelAttribute HotelReservation hotelReservation, Model model) {
        model.addAttribute("hotelReservation", hotelReservation);
        return "rez";
    }
    @PostMapping("/rez")
    public String hotelReservationToDataBase(@ModelAttribute HotelReservation hotelReservation,Model model) {
        model.addAttribute("hotelReservation", hotelReservation);
        resRepo.save(hotelReservation);
        return "redirect:/thanks";
    }

    @GetMapping("/confirmation")
    public String guests(Model model){
        model.addAttribute("rezervari", resRepo.findAll());
        return "confirmation";
    }


}
