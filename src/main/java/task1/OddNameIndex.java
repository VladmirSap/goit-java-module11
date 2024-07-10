package task1;

import Generally.UserName;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddNameIndex {
    public static void main(String[] args) {
        List<UserName> names = List.of(
                new UserName("John"),
                new UserName("Lily"),
                new UserName("Anna"),
                new UserName("Tom"),
                new UserName("Maria")
        );

        String result = formatNames(names);
        System.out.println(result);

    }

    public static String formatNames(List<UserName> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}
