package com.example;

import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception {
        //Arrange
        Feline feline = new Feline();
        List<String> expectedResponse = List.of("Животные", "Птицы", "Рыба");
        //Act
        List<String> actualResponse = feline.eatMeat();
        //Assert
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String expectedResponse = "Кошачьи";
        String actualResponse = feline.getFamily();
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void testGetKittensNoParameters() {
        Feline feline = new Feline();
        Integer expectedCount = 1;
        Integer actualCount = feline.getKittens();
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testGetKittensWithParameters() {
        Feline feline = new Feline();
        Integer expectedCount = 3;
        Integer actualCount = feline.getKittens(3);
        assertEquals(expectedCount, actualCount);
    }
}