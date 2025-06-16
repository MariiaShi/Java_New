package com.telran.homework13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberAnalyzerTest {
    NumberAnalyzer numberAnalyzer = new NumberAnalyzer();

    @Test
    void findMax() {
        List<Integer> numbers = List.of(2, 15, 78, 45, 0);
        Integer max = numberAnalyzer.findMax(numbers);
        Assertions.assertEquals(78, max);

    }

    @Test
    void findMin(){
        List<Integer> numbers = List.of(2, 15, 78, 45, 0);
        Integer min = numberAnalyzer.findMin(numbers);
        Assertions.assertEquals(0, min);
    }

    @Test
    void testFindMaxEmptyList(){
        List<Integer> numbers = new ArrayList<>();
        Assertions.assertThrows(IllegalArgumentException.class,() -> numberAnalyzer.findMax(numbers));
    }
    @Test
    void testFindMinEmptyList(){
        List<Integer> numbers = new ArrayList<>();
        Assertions.assertThrows(IllegalArgumentException.class,() -> numberAnalyzer.findMin(numbers));
    }
}