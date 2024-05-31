package com.space.planets.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/planets")
public class PlanetsController {

    @GetMapping("")
    public String getAllPlanets() {
        return "getting all planets";
    }

    @GetMapping("/")
    public String getPlanetByName(@RequestParam(value = "name") String name) {
        return "getting planet by name";
    }

    @GetMapping("/type")
    public String getPlanetsByType(@RequestParam(value = "type") String type) {
        return "getting planet by type";
    }

    @PostMapping("/addplanet")
    public String addPlanet(@RequestParam(value = "name") String name) {
        return "adding planet " + name;
    }

    @PutMapping("/updateplanet")
    public String updatePlanet(@RequestParam(value = "name") String name) {
        return "updating planet " + name;
    }
}
