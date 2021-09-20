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

    public String create(String citiesName){
        this.countries.add(citiesName);
        return "Create Cities";
    }

    public String read(Integer id){
        try{
            return id + ":" + this.countries.get(id);
        } catch (Exception exception){
            return "Not found";
        }
    }
}
