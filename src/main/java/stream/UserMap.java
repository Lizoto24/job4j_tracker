package stream;

import java.util.List;
import java.util.stream.Collectors;

public class UserMap {

    public static class User {

        private int age;

        public User(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<User> map(List<Integer> ages) {
        List<User> users = ages.stream()
                .map(age -> new User(age))
                .collect(Collectors.toList());

        return users;
    }
}
