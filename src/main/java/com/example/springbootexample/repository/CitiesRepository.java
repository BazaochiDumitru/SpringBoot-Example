package com.example.springbootexample.repository;

import java.util.ArrayList;

public class CitiesRepository {

    ArrayList<String> countries = new ArrayList<>();

    public CitiesRepository(){
        this.countries.add("Balti");
        this.countries.add("Chisinau");
        this.countries.add("Cahul");
        this.countries.add("Orhei");
    }

    public String create(String countryName){
        this.countries.add(countryName);
        return "Create Country";
    }
}
