package advanced.tasks;

import java.util.List;
import java.util.stream.Collectors;

public class StudentsCollector {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", List.of(new Course("Math"), new Course("Biology"))),
                new Student("Bob", List.of(new Course("Music"), new Course("History"))),
                new Student("Clara", List.of(new Course("Chemistry"), new Course("Math")))
        );
        List<Student> result = students.stream()
                .filter(student -> student.getCourses().stream().anyMatch(course -> course.getName().startsWith("M")))
                .distinct()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}

