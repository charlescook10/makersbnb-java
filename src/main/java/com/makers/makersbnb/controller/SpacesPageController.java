package com.makers.makersbnb.controller;

import com.makers.makersbnb.model.Space;
import com.makers.makersbnb.repository.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class SpacesPageController {

    @Autowired
    SpaceRepository spaceRepository;

    @GetMapping("/spaces")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/SpacesPage");

        Iterable<Space> spaces = spaceRepository.findAll();

        modelAndView.addObject("spaces", spaces);

        return modelAndView;
    }
}
