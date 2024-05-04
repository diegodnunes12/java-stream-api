package edu.dio.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "angular", "node", "react");

        //Predicate<String> moreFiveCaracter = word -> word.length() >= 5;

        words.stream().filter(word -> word.length() >= 5).forEach(System.out::println);
    }
}
