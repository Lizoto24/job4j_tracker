package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SummingMethod {

    static class User {

        private String name;

        private List<Bill> bills = new ArrayList<>();

        public User(String name, List<Bill> bills) {
            this.name = name;
            this.bills = bills;
        }

        public String getName() {
            return name;
        }

        public List<Bill> getBills() {
            return bills;
        }
    }

    static class Bill {

        private int balance;

        public Bill(int balance) {
            this.balance = balance;
        }

        public int getBalance() {
            return balance;
        }
    }

    private static class Pair {
        private User user;
        private Bill bill;

        public Pair(User user, Bill bill) {
            this.user = user;
            this.bill = bill;
        }

        public User getUser() {
            return user;
        }

        public Bill getBill() {
            return bill;
        }
    }

    public static Map<String, Integer> summing(List<User> users) {
        Map<String, Integer> collect = users.stream()
                .collect(Collectors.groupingBy(user -> user.getName(),
                        Collectors.summingInt(user -> user.getBills().stream()
                                .mapToInt(bill -> bill.getBalance())
                                .sum()
                        )
                ));
        return collect;
    }

}
