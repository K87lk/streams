package client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClientTest {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();

        Client client1 = new Client(1, "Nick", 30);
        client1.addPhone(new Phone("111-1111", PhoneType.MOBILE));
        clients.add(client1);

        Client client2 = new Client(2, "Vlad", 25);
        client2.addPhone(new Phone("333-3333", PhoneType.MOBILE));
        clients.add(client2);

        Client client3 = new Client(3, "Anne", 40);
        client3.addPhone(new Phone("555-5555", PhoneType.STATIONARY));
        clients.add(client3);

        Client client4 = new Client(4, "Max", 34);
        client4.addPhone(new Phone("121-1213", PhoneType.MOBILE));
        clients.add(client4);

        Client client5 = new Client(5, "Alex", 19);
        client5.addPhone(new Phone("333-3333", PhoneType.MOBILE));
        client5.addPhone(new Phone("555-5555", PhoneType.STATIONARY));
        clients.add(client5);

        Client client6 = new Client(6, "Mandy", 50);
        client6.addPhone(new Phone("555-5555", PhoneType.STATIONARY));
        clients.add(client6);

        Client oldest = clients.stream()
                .filter(client -> client.getPhones().stream()
                        .anyMatch(phone -> phone.getType() == PhoneType.STATIONARY))
                .max(Comparator.comparingInt(Client::getAge))
                .orElse(null);

        System.out.println("Самый возрастной клиент, пользующийся стационарным телефоном:");
        System.out.println("Имя: " + oldest.getName());
        System.out.println("Возраст: " + oldest.getAge());
    }
}

