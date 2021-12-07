package lesson8;

public class Fauna {

    public static void main(String[] args) {
        Animal cat = new Cat("млекопитающие", "кошка", "Кесси", "мяу", 2);
        Animal dog = new Dog("млекопитающие", "собака", "Рекс", "гав", 5);
        Animal crow = new Crow("птицы", "ворона", "Каркуша", "кар", 100);
        System.out.println(crow);
        System.out.println(cat);
        System.out.println(dog);
        crow.changeVoice("гав");
        cat.beOlder();
        System.out.println("--------------");
        System.out.println(crow);
        System.out.println(cat);
        Animal[] fauna = new Animal[]{cat, dog};
        for (Animal animal : fauna) {
            animal.setAge(100);
        }
        System.out.println("--------------");
        System.out.println(cat);
        System.out.println(dog);
        System.out.println("--------------");
        ((Cat) cat).hunter();
        ((Dog) dog).security();
        ((Crow) crow).talk();
        System.out.println("--------------");
        System.out.println(crow);
        System.out.println(cat);
        System.out.println(dog);



    }
}
