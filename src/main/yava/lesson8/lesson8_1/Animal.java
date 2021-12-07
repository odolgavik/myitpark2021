package lesson8.lesson8_1;

public abstract class Animal {

    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void voice();
}