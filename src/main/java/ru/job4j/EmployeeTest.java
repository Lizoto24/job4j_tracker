package ru.job4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeTest {
    public static void namesOver30(List<Map<String, String>> list) {
        for (Map<String, String> row : list) {
            String age = row.get("Возраст");
            Integer i = Integer.valueOf(age);
            if (i > 30) {
                String name = row.get("Имя");
                System.out.println(name);
            }
        }
    }

    public static void namesWithSalaryInRubles(List<Map<String, String>> list) {
        for (Map<String, String> row : list) {
            String salary = row.get("Зарплата");
            if (salary.endsWith("руб")) {
                String name = row.get("Имя");
                System.out.println(name);
            }
        }
    }

    public static void averageAge(List<Map<String, String>> list) {
        int sum = 0;
        int count = list.size();
        for (Map<String, String> row : list) {
            String age = row.get("Возраст");
            Integer i = Integer.parseInt(age);
            sum += i;
        }
        double average = (double) sum/count;
        System.out.println(average);
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

        namesOver30(list);
        namesWithSalaryInRubles(list);
        averageAge(list);
    }
}






