package lesson14;

import lesson14.NameUtils;
import lesson14.PhoneUtils;

public class Contact {

    private final String name;
    private final String surname;
    private final String phone;

    public Contact() {
        this(NameUtils.randomizeName(), NameUtils.randomizeSurname(), PhoneUtils.generatePhone());
    }

    public Contact(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public Contact(ContactWithOthers contact) {
        this(contact.getName(), contact.getSurname(), contact.getPhone());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}