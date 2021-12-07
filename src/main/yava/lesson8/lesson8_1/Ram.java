package lesson8.lesson8_1;

public class Ram extends Animal {

    private static final String RAM_CATEGORY = "Баран";

    public Ram() {
        super(RAM_CATEGORY);
    }

    @Override
    public void voice() {
        System.out.println(this.name + " блеет");
    }
}