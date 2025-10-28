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


    @Test
    void testDeleteCity() {
        CustomList cityList = mockCityList();
        City city = new City("Regina", "Saskatchewan");
        cityList.addCity(city);
        assertEquals(2, cityList.getCities().size());
        cityList.deleteCity(city);
        assertEquals(1, cityList.getCities().size());
        assertFalse(cityList.getCities().contains(city));
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.deleteCity(city);
        });
    }
}
