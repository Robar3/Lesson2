package lesson2;

public class MyArraySizeException extends Exception{
    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    public MyArraySizeException(String message) {
        super(message);
        printStackTrace();
    }


}
