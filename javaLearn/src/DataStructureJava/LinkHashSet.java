package DataStructureJava;

import java.util.LinkedHashSet;



public class LinkHashSet {


    public static void main(String[] args) {
        LinkedHashSet<String> lh = new LinkedHashSet<String>();
        lh.add("umesh");
        lh.add("Hello");
        lh.add("Hello");
        lh.add("joshi");

        System.out.print(lh.contains("Hello"));

        for(String i: lh){
            System.out.println(i);
        }
    }
    
}
