package ru.job4j.personal;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class BurgerStoreTest {

    @Test
    public void addClient() {
        Client petrusha = new Client("Petya",88000);
        BurgerStore.addClient(petrusha);
        String result = petrusha.getName();
        String expect = "Petya";
        assertThat(result).isEqualTo(expect);
    }

    @Test
    public void add2Clients() {
        Client petrusha = new Client("Petya",88000);
        Client cursed = new Client("Fedor", 5553535);
        new BurgerStore().addClient(petrusha);
        new BurgerStore().addClient(cursed);
        int result = new BurgerStore().getClients()[1].getNumber();
        int expected = 5553535;
        assertThat(result).isEqualTo(expected);
    }
}