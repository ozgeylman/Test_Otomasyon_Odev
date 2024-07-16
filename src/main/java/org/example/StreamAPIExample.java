package org.example;

import java.util.Arrays;
import java.util.Optional;

public class StreamAPIExample {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Integer elementToFind = 3;

        Integer result = findElement(numbers, elementToFind);
        System.out.println(result); // Output: 3

        elementToFind = 6;
        result = findElement(numbers, elementToFind);
        System.out.println(result); // Output: -1
    }

    public static <T> Integer findElement(T[] collection, T elementToFind) {
        Optional<T> foundElement = Arrays.stream(collection)
                .filter(item -> item.equals(elementToFind))
                .findFirst();
        return foundElement.map(e -> (Integer) e).orElse(-1);
    }
}

