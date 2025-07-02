package stream2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsAnalyzer {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", List.of(
                        new Course("Math", 90),
                        new Course("Physics",85)
                )),
                new Student("Bob", List.of(
                        new Course("Math", 70),
                        new Course("Physics",75),
                        new Course("Chemistry",80)
                )),
                new Student("Charlie", List.of(
                        new Course("Math", 95),
                        new Course("Chemistry",92)
                ))
        );

        List <Course> topCourses = students.stream()
                .flatMap(student -> student.getCourses().stream())
                .filter(course -> course.getGrade() > 80)
                .sorted(Comparator.comparingInt(Course::getGrade).reversed())
                .limit(5)
                .collect(Collectors.toList());

        topCourses.forEach(course ->
                System.out.println(course.getTitle() + ":" + course.getGrade()));
    }
}
