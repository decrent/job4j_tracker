package ru.job4j.personal;

public class BurgerStore {
    private static Client[] clients = new Client[100];
    private static int clientCount = 0;

    public static void addClient(Client client) {
        clients[clientCount] = client;
        clientCount++;
        BurgerStore testStatic = new BurgerStore();
    }

    public Client[] getClients() {
        return clients;
    }
}