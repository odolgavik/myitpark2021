package lesson8;

public class Doc extends Animal {

    public Doc(String klass, String family, String nickname, String voice, int age) {
        super(klass, family, nickname, voice, age);
    }

    public void security() {
        System.out.println("Собака гавкает и умеет  охранять дом");
    }

}
