/**
 * JavaCore. Homework. Lesson 2.
 * @author Afanasyeva MS
 * @version 24.10.2021
 */

class HomeWork2 {
    
    public static void main(String[] args) throws MyArraySizeException{

    String[][] arr = {{"5", "4", "8", "9"}, {"2", "3", "8", "7"}, {"34", "7", "86", "0"}, {"34", "7", "86", "0"}};
    String[][] arr1 = {{"1", "4", "8", "9"}, {"34", "7", "86", "0"}, {"34", "7", "86", "0"}};
    String[][] arr2 = {{"1", "4", "8"}, {"2", "v", "8"}, {"34", "7", "86"}, {"34", "7", "86"}};

    srtringToIntArr(arr);
    srtringToIntArr(arr1);
    srtringToIntArr(arr2);
    }
    


    static void srtringToIntArr(String[][] arr) {
        try{
            myArraySizeException(arr);
        } 
        catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        try{
            myArrayDataException(arr);
        } 
        catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    static void myArrayDataException(String[][] arr) throws MyArrayDataException {
        int arrSumm = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    arrSumm = arrSumm + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверное значение в ячейке: " + arr[i][j]);
                }
            }
        }           
        System.out.println("Сумма чисел масcива = " + arrSumm);
    }

    static void myArraySizeException(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) throw new MyArraySizeException("Неверное количество строк. В массиве должно быть 4 строки.");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException("Неверное количество столбцов. Должно быть 4 столбца.");
            for (int j = 0; j < arr[i].length; j++) {
            }
        }
    }
}
