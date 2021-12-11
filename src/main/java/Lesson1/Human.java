package Lesson1;

public class Human implements Tester{

    private double limitJump=1.5;
    private int limitRun=2000;

    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeight()<limitJump){
            System.out.println("Human jumped");
            return true;
        }
        System.out.println("Human cold ot jump");
        return false;

    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.getRange()<limitRun){
            System.out.println("Human ran");
            return true;
        }
        System.out.println("Human could not run");
        return false;

    }

    public double getLimitJump() {
        return limitJump;
    }

    public int getLimitRun() {
        return limitRun;
    }
}
