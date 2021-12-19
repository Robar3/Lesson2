package lesson3;

public class Test2 extends TelephoneDirectory{
    public static void main(String[] args) {
        add("Sidorov","89149429492");
        add("Smirnov","89148574692");
        add("Sidorov","89149849562");
        add("Sidorov","89149849562");

        System.out.println(get("Sidorov"));
        System.out.println(get("Smirnov"));

    }
}
