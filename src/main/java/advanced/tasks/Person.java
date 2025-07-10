package advanced.tasks;

import java.util.List;

public class Person {
    private String name;
    List<String> skills;

    public Person (String name,List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }
}
