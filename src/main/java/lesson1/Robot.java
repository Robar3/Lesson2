package lesson1;

public class Robot implements Tester{

    private double limitJump=0.5;
    private int limitRun=1000;

    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeight()<limitJump){
            System.out.println("Robot jumped");
            return true;
        }
        System.out.println("Robot cold ot jump");
        return false;

    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.getRange()<limitRun){
            System.out.println("Robot ran");
            return true;
        }
        System.out.println("Robot could not run");
        return false;

    }

    public double getLimitJump() {
        return limitJump;
    }

    public int getLimitRun() {
        return limitRun;
    }
}
