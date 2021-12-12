package lesson1;

public class Cat implements Tester{

    private double limitJump=2.2;
    private int limitRun=100;

    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeight()<limitJump){
            System.out.println("Cat jumped");
            return true;
        }
        System.out.println("Cat cold ot jump");
        return false;

    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.getRange()<limitRun){
            System.out.println("Cat ran");
            return true;
        }
        System.out.println("Cat could not run");
        return false;

    }

    public int getLimitRun() {
        return limitRun;
    }

}
