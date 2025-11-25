package com.makers.makersbnb.controller;

import com.makers.makersbnb.repository.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StaticPageController {

    @Autowired
    SpaceRepository spaceRepository;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/LandingPage");

        Long nSpaces = spaceRepository.count();

        modelAndView.addObject("nSpaces", nSpaces);

        String[] reviews = new String[] {"Awesome", "Nice", "Perfect"};

        modelAndView.addObject("reviews", reviews);

        Integer nBookings = 123;

        modelAndView.addObject("nBookings", nBookings);

        return modelAndView;
    }

    @GetMapping("/contactus")
    public ModelAndView contact() {
        return new ModelAndView("/ContactPage");
    }
}
