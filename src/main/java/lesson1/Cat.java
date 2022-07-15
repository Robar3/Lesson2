package lesson1;

public class Cat implements Tester{

    String name;
    final private double limitJump=2.2;
    final private int limitRun=100;

    public Cat(String name) {
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

    public int getLimitRun() {
        return limitRun;
    }

}
