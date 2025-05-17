package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenNameEqualsThenPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenIncByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobIncByName().thenComparing(new JobIncByPriority());
        int result = cmpNamePriority.compare(
                new Job("X task", 5),
                new Job("Fix bug", 8)
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenComparatorByNameDesc() {
        int result = new JobDescByName().compare(
                new Job("Fix bug", 14),
                new Job("L task", 7)
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenComparatorByPriorityDesc() {
        int result = new JobDescByPriority().compare(
                new Job("Dog's bug", 2),
                new Job("Dog's bug", 6)
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenComparatorByNameInc() {
        int result = new JobIncByName().compare(
                new Job("Hoshi task", 7),
                new Job("Bar's bug", 6)
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenComparatorByPriorityInc() {
        int result = new JobIncByPriority().compare(
                new Job("Shmers task", 11),
                new Job("Shmers task", 5)
        );
        assertThat(result).isGreaterThan(0);
    }
}