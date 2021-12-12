package lesson1;

public class Treadmill implements SportsEquipment{
    private int range;

    public Treadmill(int range) {
        this.range = range;
    }

    public int getRange() {
        return range;
    }
}
