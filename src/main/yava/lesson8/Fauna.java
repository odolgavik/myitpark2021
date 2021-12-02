package lesson8;

public class Fauna {

    public static void main(String[] args) {
        Animal cat = new Cat("млекопитающие", "кошачье", "Кесси", "мяу", 2);
        Animal doc = new Doc("млекопитающие", "псовые", "Рекс", "гав", 5);
        Animal crow = new Crow("птицы", "вороны", "Каркуша", "кар-кар", 100);
        System.out.println(crow);
        System.out.println(cat);
        System.out.println(doc);
        crow.changeVoice("гав");
        cat.beOlder();
        System.out.println("--------------");
        System.out.println(crow);
        System.out.println(cat);
        Animal[] fauna = new Animal[]{cat, doc};
        for (Animal animal : fauna) {
            animal.setAge(100);
        }
        System.out.println("--------------");
        System.out.println(cat);
        System.out.println(doc);
        System.out.println("--------------");
        ((Cat) cat).hunter();
        ((Doc) doc).security();
        ((Crow) crow).talk();
        System.out.println("--------------");
        System.out.println(crow);
        System.out.println(cat);
        System.out.println(doc);



    }
}
