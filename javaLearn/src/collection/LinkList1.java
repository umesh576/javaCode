
package collection;

import java.util.LinkedList;

import java.util.Iterator;


public class LinkList1 {


    public static void main(String[] args){
        LinkedList <String> obj = new LinkedList<String>();

        System.out.println("Linklist: "+ obj.size());

        obj.add("umesh");
        obj.add("hari");
        obj.add("ram");

        obj.removeLast();

        
        Iterator<String> it = obj.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Linklist: "+ obj.size());


    }
    
}

