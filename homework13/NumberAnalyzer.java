package com.telran.homework13;

import java.util.List;

public class NumberAnalyzer {
    public Integer findMax(List<Integer> list) {
        if (list.size() == 0){
            throw new IllegalArgumentException();
        }
        Integer max = 0;
        for (Integer num : list) {
           if( num > max){
               max = num;
           }
        }
        return max;
    }

    public Integer findMin(List<Integer> list) {
        if (list.size() == 0){
            throw new IllegalArgumentException();
        }
        Integer min = 0;
        for (Integer num : list) {
            if (num < min){
                 min = num;
            }
        }
        return min;
    }
}

