package lesson8.lesson8_1;

public class Dog extends Animal {

    private static final String DOG_CATEGORY = "Собака";

    public Dog() {
        super(DOG_CATEGORY);
    }

    @Override
    public void voice() {
        System.out.println(this.name + " гавкает");
    }
}