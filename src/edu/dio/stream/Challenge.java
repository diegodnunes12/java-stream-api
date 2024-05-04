package edu.dio.stream;

import java.util.Arrays;
import java.util.List;

public class Challenge {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // ordenando a lista
        //numbers.stream().sorted().forEach(System.out::println);

        // Soma dos numeros pares
        int result = numbers.stream().filter(number -> number % 2 == 0).reduce(0, Integer::sum);
        System.out.println(result);
    }
}
