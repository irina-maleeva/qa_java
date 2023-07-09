package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

@Mock
    Feline felineMock;
    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        lion.getKittens();
        Mockito.verify(felineMock, Mockito.times(1)).getKittens();
    }

    @Test
    public void wrongGenderDoesHaveMane() {
        Feline feline = new Feline();
        String expected = "Используйте допустимые значения пола животного - самей или самка";
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Лев", feline);
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