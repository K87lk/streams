package client;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int id;
    private String name;
    private int age;
    private List<Phone> phones;

    public Client(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phones = new ArrayList<>();
    }

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
