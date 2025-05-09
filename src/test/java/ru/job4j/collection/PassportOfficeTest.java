package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenTestNotAddMethod() {
        Citizen citizen = new Citizen("8L48a", "Cat Catovich");
        PassportOffice office = new PassportOffice();
        boolean result = office.add(citizen);
        assertThat(result).isFalse();
    }
}