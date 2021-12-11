package Lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Random random =new Random();
        List<Tester> testers = new ArrayList<>();
        List<SportsEquipment> sportsEquipments = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            testers.add(new Human());
            testers.add(new Cat());
            testers.add(new Robot());
        }


        for (int i = 0; i < 3; i++) {
            sportsEquipments.add(new Treadmill(random.nextInt((3000 - 50) + 1) + 50));
            sportsEquipments.add(new Wall((0.1 + (3 - 0.1) * random.nextDouble())));
        }

        for (Tester tester: testers) {
            for (int i = 0; i < sportsEquipments.size(); i++) {
                if (sportsEquipments.get(i) instanceof Treadmill)
                tester.run((Treadmill) (sportsEquipments.get(i)));
                else tester.jump((Wall) (sportsEquipments.get(i)));
            }
        }

    }
}
