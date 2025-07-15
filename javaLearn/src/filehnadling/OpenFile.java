package filehnadling;

import java.io.IOException;
import java.io.File;
public class OpenFile {
    public static void main(String[] args) {
        try{

            File file = new File("file1.txt");

            if(file.createNewFile()){
                System.out.println("file created successfully");
            }else{
                System.out.println("file already exists.");
            }
        }catch(IOException e){
            System.out.println("hello umesh");
            e.printStackTrace();
        }
    }
    
}
