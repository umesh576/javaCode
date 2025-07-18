package DataStructureJava;


import java.util.HashSet;

public class HashSetcon {

    
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("umesh");
        hs.add("umesh");
        hs.add("joshi");
        hs.add("hari");
        hs.add("joshi");
        hs.remove("umesh");
        // System.out.println(hs);


        // Collection.sort(hs);
        for(String i: hs){
            System.out.println(i);
        }
    }

}
