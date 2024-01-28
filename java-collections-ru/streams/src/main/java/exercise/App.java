package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emailsList){
        String gmail = "gmail.com";
        String yandex = "yandex.ru";
        String hotmail = "hotmail.com";
        return emailsList.stream()
                .filter(s -> s.endsWith(gmail) || s.endsWith(yandex) || s.endsWith(hotmail))
                .count();
    }
}
// END
