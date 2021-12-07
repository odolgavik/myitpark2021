package lesson8;

public class Dog extends Animal {

    public Dog(String klass, String family, String nickname, String voice, int age) {
        super(klass, family, nickname, voice, age);
    }

    public void security() {
        System.out.println("Собака гавкает и умеет охранять дом");
    }

}
