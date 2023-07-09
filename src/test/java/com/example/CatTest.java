package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Feline feline = new Feline();

    @Mock
    Feline felineMock;

    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(felineMock);
        cat.getFood();
        Mockito.verify(felineMock, Mockito.times(1)).eatMeat();
    }
}