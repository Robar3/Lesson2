package lesson1;

public interface Tester {

    String getName();
    double getLimitJump();
    int getLimitRun();

   default boolean jump(Wall wall,double limitJump,String name) {
        if (wall.getHeight() < limitJump) {
            System.out.println(name+" jumped");
            return true;
        }
        System.out.println(name+" cold ot jump");
        return false;

    }




   default boolean run(Treadmill treadmill,int limitRun,String name) {
        if (treadmill.getRange() < limitRun) {
            System.out.println(name+" ran");
            return true;
        }
        System.out.println(name+" could not run");
        return false;

    }

}
