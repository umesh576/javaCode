import java.util.Scanner;

public class Recursion {

    static int factroial(int x){
        // int total = 1;
        if(x <= 1){
            return 1;
        }
        
        // total *= x;
        // x--;
        return x*factroial(x-1);

    }
    static public void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int num = sc.nextInt();

        int y = factroial(num);
        System.out.println(y);
         
        sc.close();
    }
    
}
