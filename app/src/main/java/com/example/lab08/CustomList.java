package com.example.lab08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public List<City> getCities(){
        List<City> list = cities;
        return list;
    }
    

    // Will be implemented later using TDD (leave blank for now)
    public boolean hasCity(City city){
        if (cities.contains(city)) {
            return true;
        }
        else {
            return false;
        }
    }

    public void deleteCity(City city){
        if (cities.contains(city)) {
            cities.remove(city);
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public int countCities() {
        return cities.size();
    }
}
