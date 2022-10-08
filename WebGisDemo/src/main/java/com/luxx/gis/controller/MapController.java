package com.luxx.gis.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Slf4j
public class MapController {

    @GetMapping("/map")
    public ModelAndView map() {
        return new ModelAndView("map");
    }

}
