package HW4.hw4_2.hw4_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueWordsCounter {

    public static void main(String[] args) {

        String[] words = {"apple", "banana", "orange", "apple", "grape", "banana", "pear", "banana", "kiwi", "orange"};

        // Создаем HashMap для хранения уникальных слов и их количества
        Map<String, Integer> uniqueWords = new HashMap<>();

        // Перебираем все слова в массиве
        for (String word : words) {

            // Если слово уже есть в HashMap, увеличиваем его количество на 1
            if (uniqueWords.containsKey(word)) {
                int count = uniqueWords.get(word);
                uniqueWords.put(word, count + 1);
            }
            // Если слово встречается впервые, добавляем его в HashMap
            else {
                uniqueWords.put(word, 1);
            }
        }

        // Выводим список уникальных слов и их количество в массиве
        System.out.println("Уникальные слова в массиве: " + Arrays.toString(uniqueWords.keySet().toArray()));
        System.out.println("Количество повторений каждого слова: " + uniqueWords);
    }
}