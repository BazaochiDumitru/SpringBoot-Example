package com.example.springbootexample.model;

public class City {
    private Integer id = null;
    private String name = null;

    private Integer countryId = null;
    public static Integer autoincrementId = 0;
    private String countryName;

    City(){

    }

    public City(String name, Integer countryId, String countryName){
        City.autoincrementId++;
        this.id = City.autoincrementId;
        this.name = name;
        this.countryId = countryId;
        this.countryName = countryName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    //todo

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName(){
        //todo to implement this method
        return countryName;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryId=" + countryId +
                ", countryName=" + this.getCountryName() +
                '}';
    }
}
