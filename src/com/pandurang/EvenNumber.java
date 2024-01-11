package com.pandurang;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        integerList.stream()
                .filter(e -> e%2 == 0)
                .forEach(System.out::println);
    }

}

