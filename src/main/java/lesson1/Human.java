package lesson1;

public class Human implements Tester{

    String name;
    private double limitJump=1.5;
    private int limitRun=2000;

    public Human(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    public double getLimitJump() {
        return limitJump;
    }

    public int getLimitRun() {
        return limitRun;
    }
}
