package task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddNameIndex {
    public static void main(String[] args) {
        List<UserNames> names = List.of(
                new UserNames("John"),
                new UserNames("Lily"),
                new UserNames("Anna"),
                new UserNames("Tom"),
                new UserNames("Maria")
        );

        String result = formatNames(names);
        System.out.println(result);

    }

    public static String formatNames(List<UserNames> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}
