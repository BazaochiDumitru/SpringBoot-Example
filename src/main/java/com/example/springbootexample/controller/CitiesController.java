package com.example.springbootexample.controller;

import com.example.springbootexample.repository.CitiesRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class CitiesController {
    CitiesRepository citiesRepository = new CitiesRepository();

    @PostMapping("")
    public String create(@RequestParam String citiesName){
        return citiesRepository.create(citiesName);
    }

    @GetMapping("countries/{id}")
    public String read(@PathVariable Integer id){
        return citiesRepository.read(id);
    }

    @GetMapping("countries")
    public String readAll(){
        return citiesRepository.readAll();
    }

}
