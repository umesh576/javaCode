package DataStructureJava;

import java.util.LinkedList;
public class LinkListjava {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.addFirst("umesh");
        ll.addFirst("umesh");
        ll.addFirst("ram");
        ll.addLast("omm");
        // ll.removeFirst();
        System.out.println(ll.getLast());
    
        System.out.println(ll);
    }
    

}
