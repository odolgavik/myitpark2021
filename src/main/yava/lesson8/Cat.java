package lesson8;

public class Cat extends Animal {
    public Cat(String klass, String family, String nickname, String voice, int age) {
        super(klass, family, nickname, voice, age);
    }

    public void hunter() {
        System.out.println("Кошка мяукает и хорошо ловит мышей");
    }
}
