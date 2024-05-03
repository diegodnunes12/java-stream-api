package edu.dio.stream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> hello = () -> "Hello world, you are welcome";

        List<String> list = Stream.generate(hello).limit(5).collect(Collectors.toList());

        list.forEach(s -> System.out.println(s));
    }
}
