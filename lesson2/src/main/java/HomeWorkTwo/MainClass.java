package HomeWorkTwo;

public class MainClass {
    public static void main(String[] args) {
        Cat [] cats = {
                new Cat("Барсик", 105),
                new Cat("Федор", 50),
                new Cat("Дорофей", 100),
                new Cat("Федот", 99),
                new Cat("Персик", 108),
                new Cat("Семен", 80),
        };
        Plate plate = new Plate(100);
        plate.info();
        for (Cat cat : cats){
            cat.eat(plate.getFood());
        }
    }
}
