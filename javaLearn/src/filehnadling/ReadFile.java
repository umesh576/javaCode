package filehnadling;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {
        try{

            File fp = new File("writeFile.txt");
            Scanner read = new Scanner(fp);
            while(read.hasNextLine()){
                String data = read.nextLine();
                System.out.println(data);
            }
            System.out.println(fp.length());
            read.close();
            

            // fp.close();

        }catch(IOException e){
            System.out.println("Error occur.");
            e.printStackTrace();
        }


        
    }
}
