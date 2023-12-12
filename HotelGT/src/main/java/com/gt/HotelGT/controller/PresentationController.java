package com.gt.HotelGT.controller;

import com.gt.HotelGT.model.About;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PresentationController {

    @GetMapping("/")
    public String root(){
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home(@RequestParam(name = "welcomePage", defaultValue = "", required = false) String welcome,
                         Model model) {
        model.addAttribute("welcome", model);
        return "home";
    }
    @GetMapping("/about")
    public String aboutPage(@RequestParam(name = "aboutPage", defaultValue = "", required = false) String about,
                         Model model) {
        model.addAttribute("aboutHotel", new About());
        return "about";
    }
    @GetMapping("/thanks")
    public String thanks(){
        return "thanks";
    }

    @GetMapping("/homeGT")
    public String homeGT(){
        return "homeGT";
    }


}
