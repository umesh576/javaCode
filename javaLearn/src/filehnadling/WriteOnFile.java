package filehnadling;

// import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOnFile {


    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("writeFile.txt");
            fw.write("hello umesh you are true leader and ture gentleman.");
            fw.write("hello umesh `");
            fw.close();

            
        }catch(IOException e){
            System.out.println("unable to open thisn file");
            e.printStackTrace();
        }
    }
    
}
