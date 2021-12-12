package lesson2;

public class Test {
    public static void main(String[] args) {
        char[][] arr = new char[4][4];
        arr[0][0]='1';
        arr[0][1]='r';
        try {
            System.out.println(sumInt(arr));
        }catch (MyArraySizeException e){
            e.getMessage();
        }
        catch (MyArrayDataException e){
            e.getMessage();
        }

    }

    private static int sumInt(char[][] arr) throws MyArraySizeException,MyArrayDataException {
        int result=0;


        if (arr.length!=4||arr[0].length!=4){
            throw new MyArraySizeException("Массив не соответствует размеру 4 на 4");
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                result = Integer.parseInt(String.valueOf(arr[i][j]));
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("В ячейке массива на строке "+i+" и линии "+j+" лежит элемент не являющийся числом");
                }
            }
        }
        return result;
    }
}
