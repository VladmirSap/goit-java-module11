package task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortedArrayNumbers {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};

        String combined = Arrays.stream(array)
            .map(String::trim)
            .collect(Collectors.joining(", "));

        String result = Arrays.stream(combined.split(", "))
             .map(Integer::parseInt)
             .sorted()
             .map(Object::toString)
             .collect(Collectors.joining(", "));

        System.out.println(result);
        }
}
