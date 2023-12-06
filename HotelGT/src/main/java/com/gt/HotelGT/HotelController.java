package com.gt.HotelGT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HotelController {
    @Autowired
    HotelReservationRepository resRepo;

    @GetMapping("/home")
    public String string(@RequestParam(name = "welcomePage", defaultValue = "", required = false) String welcome,
                         Model model) {
//        model.addAttribute("welcome", welcome);
        model.addAttribute("hotelReservation", new HotelReservation());
        return "home";
    }

    @GetMapping("/rez")
    public String hotelReservation(@ModelAttribute HotelReservation hotelReservation, Model model) {
        model.addAttribute("hotelReservation", hotelReservation);
        return "rez";
    }
    @PostMapping("/rez")
    public String hotelReservationToDataBase(@ModelAttribute HotelReservation hotelReservation,Model model) {
        model.addAttribute("hotelReservation", hotelReservation);
        resRepo.save(hotelReservation);
        return "redirect:/home";
    }


}
