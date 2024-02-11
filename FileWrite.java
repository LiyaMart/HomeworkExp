import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;


public class FileWrite {
  
    public void createFile(String data) throws Exception {
        String[] dataNum = data.split(" ");
        String fileName = dataNum[0] + ".txt";
        try {
            File path = new File(fileName);

            if (!path.exists()){
                path.createNewFile();
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));

            String writeString = String.join(" ", data);

            bw.write(writeString);
            bw.write("\n");
            bw.close();

        } catch (Exception e){
            throw new IOException("Ошибка записи данных");
        }
    }
}