package client;

public class Phone {
    private String number;
    private PhoneType type;

    public Phone(String number, PhoneType type) {
        this.number = number;
        this.type = type;
    }

    public PhoneType getType() {
        return type;
    }
}
