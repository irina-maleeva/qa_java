package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class LionTest1 {

    @Mock
    Feline felineMock;
    @Test
    public void tesGetKittens() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        lion.getKittens();
        Mockito.verify(felineMock, Mockito.times(1)).getKittens();
    }

    @Test
    public void testWrongGenderDoesHaveMane() {
        Feline feline = new Feline();
        String expected = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Детеныш", feline);
        });
        assertEquals(expected, exception.getMessage());
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        lion.getFood();
        Mockito.verify(felineMock).getFood("Хищник");
    }
}