package swtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
    
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void shouldSayOneWhenNumberIsOne() {
        String actualResult = fizzBuzz.say(1);
        assertEquals("1", actualResult);
    }
    
    @Test
    public void shouldSayTwoWhenNumberIsTwo() {
        String actualResult = fizzBuzz.say(2);
        assertEquals("2", actualResult);
    }
    
    @Test
    public void shouldSayFizzWhenNumberIsThree() {
        String actualResult = fizzBuzz.say(3);
        assertEquals("Fizz", actualResult);
    }
    
    @Test
    public void shouldSayFizzWhenNumberIsSix() {
        String actualResult = fizzBuzz.say(6);
        assertEquals("Fizz", actualResult);
    }
    
    @Test
    public void shouldSayBuzzWhenNumberIsFive() {
        String actualResult = fizzBuzz.say(5);
        assertEquals("Buzz", actualResult);
    }
    
    @Test
    public void shouldSayFizzBuzzWhenNumberIsFifteen() {
        String actualResult = fizzBuzz.say(15);
        assertEquals("FizzBuzz", actualResult);
    }
    
}
