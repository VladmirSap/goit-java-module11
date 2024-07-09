package task2;

import task1.UserNames;

import java.util.List;
import java.util.stream.Collectors;

public class SortedNames {
    public static void main(String[] args) {
        List<UserNames> names = List.of(
                new UserNames("John"),
                new UserNames("Lily"),
                new UserNames("Anna"),
                new UserNames("Tom"),
                new UserNames("Maria")
        );

        List<String> sortedUpperCaseNames = processStrings(names);
        sortedUpperCaseNames.forEach(System.out::println);

    }

    public static List<String> processStrings(List<UserNames> names ) {

        return names.stream()
                .map(user -> user.getName().toUpperCase())
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList()); // збираємо в список
    }
}
