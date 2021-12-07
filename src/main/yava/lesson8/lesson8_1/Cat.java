package lesson8.lesson8_1;

public class Cat extends Animal {

    public static final String CAT_CATEGORY = "Кошка";

    public Cat() {
        super(CAT_CATEGORY);
    }

    @Override
    public void voice() {
        System.out.println(this.name + " мяукает");
    }
}