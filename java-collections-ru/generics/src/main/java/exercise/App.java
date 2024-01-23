package exercise;

import java.util.*;
import java.util.Map.Entry;

// BEGIN
public class App {


    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> bookList = new ArrayList<>(); // создали лист, который будем возвращать
        if (where.isEmpty() || books.isEmpty()) { // если что-то пусто, то вернем пустой лист
            return bookList;
        }
        for (Map<String, String> map : books) { // проходимся по книгам

            if (map.equals(where)) { //если книга полностью совпадает, то добавляем ее сразу
                bookList.add(where);
                return bookList;
            }

            Set<String> bookKeys = map.keySet();
            Set<String> whereKeys = where.keySet();

            if (bookKeys.containsAll(whereKeys)) { // если все ключи в whereKeys совпадают с ключами в bookKeys
                boolean keysAndValuesEqual = true; // вводим переменную, чтобы найти где значения одинаковых ключей не совпадают,

                for (String key : bookKeys) {
                    if (where.containsKey(key)) {
                        if (!where.get(key).equals(map.get(key))) {
                            keysAndValuesEqual = false; // находим различия в value - это значит не добавляем
                            break;
                        }
                    }
                }
                if (keysAndValuesEqual) {// если же все значения будут совпадать то добавляем map в bookList
                    bookList.add(map);
                }
            }

        }
        return bookList;
    }

}
//END
