package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    private CustomList mockCityList() {
        CustomList cityList = new CustomList();
        cityList.addCity(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testHasCity() {
        CustomList cityList = mockCityList();
        City city = new City("Regina", "Saskatchewan");
        cityList.addCity(city);
        assertTrue(cityList.hasCity(city));
        City city2 = new City("Charlottetown", "Prince Edward Island");
        assertFalse(cityList.hasCity(city2));
    }

}
