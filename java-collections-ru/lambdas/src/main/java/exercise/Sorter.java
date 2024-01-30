package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.Objects;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(user -> Objects.equals(user.get("gender"), "male")) // каждая мапа "user" фильтруется на значение ключа "gender"
                .sorted((user1, user2) -> {                                    // в сортер кладем две мапы, которые будем сравнивать
                    LocalDate date1 = LocalDate.parse(user1.get("birthday"));  // сравниваем ключ "birthday" первой мапы со второй
                    LocalDate date2 = LocalDate.parse(user2.get("birthday"));
                    return date1.compareTo(date2); // ввели 2 переменные и сравнили их с помощью метода compareTo
                })
                .map(user -> user.get("name"))  // после сортировки проходимся только по значениям ключа "name"
                .collect(Collectors.toList());  // и собираем все в список.
    }
}
// END
