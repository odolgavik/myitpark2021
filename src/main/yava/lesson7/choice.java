package lesson7;

public class choice {
    public static void main(String[] args) {
        Animals doc = new Animals();
        doc.view = "Собака";
        doc.nickname = "Багира";
        doc.run = 500;
        doc.speed = 15;
        doc.swim = "10 метров";
        doc.wagtheTail = "добрая";

        Animals cat = new Animals();
        cat.view = "Кот";
        cat.nickname = "Кузя";
        cat.run = 200;
        cat.speed = 8;
        cat.swim = "не умеет плавать";
        cat.wagtheTail = "злой";

       Animals tiger = new Animals("Тигр", "нет клички",1500, 65, "может проплыть 6 км","волнение");

        System.out.println(doc == cat);
        System.out.println(doc.swim == tiger.swim);
        System.out.println(doc.wagtheTail);

        Animals [] animal = new Animals[] {cat, doc, tiger};
        for (Animals animals : animal );
        if (8 < cat.speed);
        System.out.println("Это животное движется быстрее кошки" );
    }
}
