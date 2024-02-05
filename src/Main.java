import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        task1();
        System.out.println("Задание 2");
        task2();
        System.out.println("Задание 3");
        task3();
        System.out.println("Задание 4");
        task4();
    }

    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> evenNumbers = new HashSet<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        List<Integer> sortedEvenNumbers = new ArrayList<>(evenNumbers);
        sortedEvenNumbers.sort(null);
        for (int num : sortedEvenNumbers) {
            System.out.println(num);
        }
    }

    public static void task3() {
        HashSet<String> names = new HashSet<>(List.of("Виктория", "Лев", "Дарья", "Кирилл", "Вероника", "Дарья", "Евгения", "Кирилл", "Василиса", "Виктория"));
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : strings) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}