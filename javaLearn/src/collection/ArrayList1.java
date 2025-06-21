package collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;

public class ArrayList1 {
    
    public static void main(String[] args){

        ArrayList <String> obj = new ArrayList<String>();

        System.out.println("ArraySize: "+ obj.size());

        obj.add("Roshan");
        obj.add("umesh");
        obj.add("Ram");
        obj.add("hari");

        System.out.println("ArraySize: "+ obj.size());

        Collections.sort(obj);
        System.out.println(obj);

        Iterator<String> it = obj.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        


    }
}
