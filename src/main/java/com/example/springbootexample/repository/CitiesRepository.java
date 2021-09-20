package com.example.springbootexample.repository;

import java.util.ArrayList;

public class CitiesRepository {

    ArrayList<String> countries = new ArrayList<>();

    public CitiesRepository(){
        this.countries.add("Moldova");
        this.countries.add("Ucraina");
        this.countries.add("Romania");
        this.countries.add("Turkey");
    }

    public String create(String countryName){
        this.countries.add(countryName);
        return "Create Country";
    }
}
