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
        List<T> res = new ArrayList<>();
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            res.add(iterator1.next());
            res.add(iterator2.next());
        }
        return res.stream();
    }
}
