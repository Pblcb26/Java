/**
 * JavaCore. Homework. Lesson 5.
 * @author Afanasyeva MS
 * @version 20.11.2021
 */
import java.io.*;

class HomeWork5 {
    
    public static void main(String[] args) throws IOException{

        File file = new File("appdata.csv");
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 123}, {300, 400, 500}};

        String[] header2 = {"Val 1", "Val 2", "Val 3"};
        int[][] data2 = {{25, 648, 222}, {666, 113, 248}};

        AppData appData = new AppData(header, data, file);
        AppData appData2 = new AppData(header2, data2, file);


        appData.save(); //при вызове метода данные полностью перезаписываются
        appData.read();

        appData2.save(); //при вызове метода данные полностью перезаписываются
        appData2.read();
    }
}