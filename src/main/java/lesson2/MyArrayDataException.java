package lesson2;

public class MyArrayDataException extends NumberFormatException{
    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    public MyArrayDataException(String message) {
        super(message);
        printStackTrace();
    }
}
