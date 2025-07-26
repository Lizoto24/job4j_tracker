package bell;

import java.util.*;

public class EmployeeFilter {
    public static void namesUnder30(List<Map<String, String>> list) {
        list.stream()
                .filter(row -> {
                    int i = Integer.parseInt(row.get("Возраст"));
                    return i < 30;
                })
                .map(row -> row.get("Имя"))
                .forEach(System.out::println);
    }

    public static void namesWithSalaryInRubles(List<Map<String, String>> list) {
        list.stream()
                .filter(row -> row.get("Зарплата").endsWith("руб"))
                .map(row -> row.get("Имя"))
                .forEach(System.out::println);
    }

    public static void averageAge(List<Map<String, String>> list) {
        OptionalDouble result = list.stream()
                .mapToInt(row -> Integer.parseInt(row.get("Возраст")))
                .average();
        if (result.isPresent()) {
            System.out.println(result.getAsDouble());
        }
    }

    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> row1 = new HashMap<>();
        row1.put("Имя", "Кирилл");
        row1.put("Возраст", "26");
        row1.put("Должность", "Middle java dev");
        row1.put("Зарплата", "150000 руб");

        Map<String, String> row2 = new HashMap<>();
        row2.put("Имя", "Виталий");
        row2.put("Возраст", "28");
        row2.put("Должность", "Senior java automation QA");
        row2.put("Зарплата", "2000 $");

        Map<String, String> row3 = new HashMap<>();
        row3.put("Имя", "Александр");
        row3.put("Возраст", "31");
        row3.put("Должность", "junior functional tester");
        row3.put("Зарплата", "50000 руб");

        Map<String, String> row4 = new HashMap<>();
        row4.put("Имя", "Дементий");
        row4.put("Возраст", "35");
        row4.put("Должность", "dev-ops");
        row4.put("Зарплата", "1500 $");

        list.add(row1);
        list.add(row2);
        list.add(row3);
        list.add(row4);

        namesUnder30(list);
        namesWithSalaryInRubles(list);
        averageAge(list);
    }
}
