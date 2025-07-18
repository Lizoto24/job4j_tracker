package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> name = n -> (n.getName().contains(key));
        Predicate<Person> surname = s -> (s.getSurname().contains(key));
        Predicate<Person> address = a -> (a.getAddress().contains(key));
        Predicate<Person> phone = p -> (p.getPhone().contains(key));
        Predicate<Person> combine = name.or(surname).or(address.or(phone));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}