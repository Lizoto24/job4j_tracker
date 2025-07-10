package advanced.tasks;

import java.util.List;
import java.util.stream.Collectors;

public class SkillsCollector {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Bob", List.of("Java", "SQL", "Git")),
                new Person("Alice", List.of("Python", "Git")),
                new Person("Charlie", List.of("Java", "Kubernetes"))
        );
        List<String> sortedSkills = people.stream()
                .flatMap(person -> person.getSkills().stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        sortedSkills.forEach(skill -> System.out.println(skill));
    }
}
