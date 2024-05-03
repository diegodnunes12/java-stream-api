package edu.dio.stream;

import java.util.Arrays;
import java.util.List;
/**
 * ConsumerExample
 */
public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        /* Consumer<Integer> printNumberEven = number -> {
            if(number % 2 == 0) {
                System.out.println(number);
            }
        }; */

        //numbers.stream().forEach(printNumberEven);

        numbers.forEach(n -> {
            if(n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}