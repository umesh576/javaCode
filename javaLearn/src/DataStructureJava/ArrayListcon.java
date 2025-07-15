package DataStructureJava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListcon {

    public static void main(String[] args) {

        ArrayList<String> arli = new ArrayList<String>();
        arli.add("umesh");
        arli.add("joshi");
        arli.add("shyam");
        arli.add("hari");
        // arli.add(1,"kimxo");
        arli.set(2, "whatup");

        // ArrayList<String> newAr = new ArrayList<String>();
        // for(int i = 0; i< arli.size();i++){
        //     System.out.println(arli.get(i));
        // }

        // for(String i : arli){
        //     System.out.println(i);
        // }
        Collections.sort(arli);

        System.out.println(arli);
        
    }
    
}
