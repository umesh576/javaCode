package collection;
import java.util.Stack;
import java.util.Iterator;

public class StackDemo {

    public static void main(String[] args){

        Stack<String> stack = new Stack <String>();
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        stack.push("umesh");
        stack.push("hari");
        stack.push("Ram");
        stack.push("k xa khaber");

        System.out.println(stack);

        Iterator<String> it = stack.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
    
}
