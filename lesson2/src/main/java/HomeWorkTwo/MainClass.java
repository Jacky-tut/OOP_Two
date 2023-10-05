package HomeWorkTwo;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 105);
        Cat cat1 = new Cat("Федор", 50);
        Cat cat2 = new Cat("Дорофей", 100);
        Cat cat3 = new Cat("Федот", 99);
        Cat cat4 = new Cat("Персик", 108);
        Cat cat5 = new Cat("Семен", 80);

        Plate plate = new Plate(100);

        plate.info();
        cat.eat(plate.getFood());
        cat1.eat(plate.getFood());
        cat2.eat(plate.getFood());
        cat3.eat(plate.getFood());
        cat4.eat(plate.getFood());
        cat5.eat(plate.getFood());
        plate.setFood(plate.getFood() - cat.getAppetite());
    }

}
