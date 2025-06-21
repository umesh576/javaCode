package collection;
import java.util.Hashtable;
import java.util.Enumeration;

public class HashTable {
        public static void main(String[] args){

            Hashtable <Integer, String> ht= new Hashtable<Integer, String>();

            ht.put(1, "umesh");
            ht.put(2, "hello");
            ht.put(3, "Hii");

            System.out.println(ht);

            Enumeration em =ht.keys();


            while (em.hasMoreElements()) {
                int keys = (Integer) em.nextElement();
                String value = (String) ht.get(keys);
                System.out.println("keys"+keys +"\tvalues"+value);

                
            }

            
        }
}
