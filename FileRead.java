import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileRead {
  
    public void readFile(String filename) throws Exception {

        try {
            FileReader reader = new FileReader(filename + ".txt");
            reader.close();
            
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден!");
        }

        FileReader reader = new FileReader(filename + ".txt");

            try {      int i;
            while((i=reader.read())!=-1){
              
                System.out.print((char)i);
            }
} catch (Exception e){
    System.out.println("Ошибка чтения файла!");
}
finally{
    reader.close();
}
}
}


       