package edu.dio.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        /* Function<Integer, Integer> doubleValue = number -> number * 2;

        List<Integer> numbersDouble = numbers.stream().map(doubleValue).collect(Collectors.toList());

        numbersDouble.forEach(n -> System.out.println(n)); */

        List<Integer> numbersDouble = numbers.stream().map(n -> n*2).collect(Collectors.toList());
        numbersDouble.forEach(System.out::println);
    }
}
