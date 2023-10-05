package HomeWorkTwo;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("В тарелке " + food + " корма");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
    public void fillThePlate(int count){
        this.food += count;
    }
}
