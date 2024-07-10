package task2;

import Generally.UserName;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNames {
    public static void main(String[] args) {
        List<UserName> names = List.of(
                new UserName("John"),
                new UserName("Lily"),
                new UserName("Anna"),
                new UserName("Tom"),
                new UserName("Maria")
        );

        List<String> sortedUpperCaseNames = processStrings(names);
        sortedUpperCaseNames.forEach(System.out::println);

    }

    public static List<String> processStrings(List<UserName> names ) {

        return names.stream()
                .map(user -> user.getName().toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()); // збираємо в список
    }
}
