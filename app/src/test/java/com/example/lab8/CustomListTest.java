package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList() {
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus one
     */
    @Test
    public void addCityTest() {
        list= MockCityList();
        int listSize =list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize +1);
    }

    /**
     * create a mock list
     * add a city to the list
     * check if the city is in the list
     */
    @Test
    void hasCityTest() {
        list = MockCityList();
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    /**
     * create a mock list
     * add a city to the list
     * check if the city is in the list
     * delete the city from the list
     * check if the city is no longer in the list
     */
    @Test
    void deleteCityTest() {
        list = MockCityList();
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertEquals(list.getCount(),1);
        list.deleteCity(city);
        assertEquals(list.getCount(),0);
    }

    /**
     * create a mock list
     * check if the list is empty
     */
    @Test
    void getCountTest() {
        list = MockCityList();
        assertEquals(list.getCount(),0);
    }

}
