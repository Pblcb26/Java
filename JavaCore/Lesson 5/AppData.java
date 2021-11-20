import java.io.*;

public class AppData{
    private String[] header;
    private int[][] data;
    private File file;

    public AppData(String[] header, int[][] data, File file) {
        this.header = header;
        this.data = data;
        this.file = file;
        
    }

    public void save() throws IOException{
        try (FileWriter writer = new FileWriter(file, false)) {
            writer.append(String.join(";", header));
            writer.append("\n");
            for (int[] i : data) {
                for ( int j : i) {
                    writer.append(String.valueOf(j));
                    writer.append("; ");
                }
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read() throws IOException{
        try(FileReader reader = new FileReader(file)) {
            int i;
            while((i=reader.read())!=-1){  
                System.out.print((char)i);
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }       
}
    

