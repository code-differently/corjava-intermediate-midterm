package com.codedifferently.midterm.partA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void vowelChopAndScrewTest01(){
        String input = "mountain throne king lord america";
        String expected = "niatnuom throne king lord acirema";
        String actual = Problem.vowelChopAndScrew(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void vowelChopAndScrewTest02(){
        String input = "fireboard batman robin fourteen";
        String expected = "draoberif batman robin neetruof";
        String actual = Problem.vowelChopAndScrew(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void vowelChopAndScrewTest03(){
        String input = "Language english french chocolate";
        String expected = "Egaugna english french etalocohc";
        String actual = Problem.vowelChopAndScrew(input);
        Assertions.assertEquals(expected, actual);
    }
}
