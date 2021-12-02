package lesson8;

public class Animal {

    private String klass;
    private String family;
    private String nickname;
    private String voice;
    private int age;

    public Animal(String klass, String family, String nickname, String voice, int age) {
        this.klass = klass;
        this.family = family;
        this.nickname = nickname;
        this.voice = voice;
        this.age = age;
    }

    public void changeVoice(String newVoice) {
        this.voice = newVoice;
    }

    public void beOlder() {
        this.age++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private Integer getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "klass='" + klass + '\'' +
                ", family='" + family + '\'' +
                ", nickname='" + nickname + '\'' +
                ", voice='" + voice + '\'' +
                ", age=" + age +
                '}';
    }
}
