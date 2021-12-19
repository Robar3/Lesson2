package lesson1;

public class Robot implements Tester{

    String name;
    private double limitJump=0.5;
    private int limitRun=1000;

    public Robot(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getLimitJump() {
        return limitJump;
    }

    @Override
    public int getLimitRun() {
        return limitRun;
    }
}
