package HomeWorkTwo;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness = false;



    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void eat(int food) {
        if(food >= this.appetite){
            this.fullness = true;
            System.out.printf("Кот %s наелся\n", name);
        }
        else{
            this.fullness = false;
            System.out.printf("Кот %s остался голодным\n", name);
        }
    }
}
