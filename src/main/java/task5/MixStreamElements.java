package task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MixStreamElements {
    public static void main(String[] args) {
        Stream<String> firstStream = Stream.of("A", "C", "E", "G");
        Stream<String> secondStream = Stream.of("AB", "CD", "EF");
        Stream<String> zip = zip(firstStream, secondStream);
        System.out.println(zip.collect(Collectors.toList()));

    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> secondIterator = second.iterator();
        return first.flatMap(element ->
                secondIterator.hasNext()
                        ? Stream.of(element, secondIterator.next())
                        : Stream.empty());
    }
}
