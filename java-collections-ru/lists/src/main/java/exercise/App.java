package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
        public static boolean scrabble(String letter, String word) {
                if (word.length() > letter.length()) { // если второе слово длиннее первого то смысла идти дальше нет
                        return false;
                }
                letter = letter.toLowerCase(); // убираем регистр
                word = word.toLowerCase(); // и здесь
                for(int i=0;i<word.length();i++) {
                        if(letter.indexOf(word.charAt(i)) == -1) { // если в первом слове нет ни одной буквы второго слова то выходим
                                return false;
                        } else {
                                int charLocation = letter.indexOf(word.charAt(i)); // убираем ту букву, которая совпала и возвращаем обновленный letter
                                letter = letter.substring(0,charLocation)
                                        + letter.substring(charLocation+1);
                        }
                }

                return true;
        }
}
//END
