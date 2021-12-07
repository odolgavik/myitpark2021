package lesson8.lesson8_1;

public class FaunaRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Ram ram = new Ram();

        Animal[] animals = new Animal[]{cat, dog, ram};
        for (Animal animal : animals) {
            animal.voice();
        }
    }
}