package collection;
import java.util.HashMap;
import java.util.Map;

public class HasMap {
        public static void main(String[] args){

            Map <Integer, String> ht= new HashMap<Integer, String>();

            ht.put(4,null);
            ht.put(2, "hello");
            ht.put(null, "Hii");
            

            System.out.println(ht);

            

            
        }
}
