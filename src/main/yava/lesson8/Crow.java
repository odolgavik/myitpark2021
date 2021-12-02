package lesson8;

public class Crow extends Animal {
    public Crow(String klass, String family, String nickname, String voice, int age) {
        super(klass, family, nickname, voice, age);
    }

    public void talk() {
        System.out.println("Ворон каркает и может говорить");
    }
}
