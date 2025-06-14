import java.util.Scanner;
public class Qn2{
    static public void main(String[] args){
        int day;
        Scanner ss = new Scanner(System.in);
        System.out.print("Input day to know name: ");
        day = ss.nextInt();
        switch(day){
            case 1:
                System.out.print("sunday");
                break;
            case 2:
                System.out.print("monday");
                break;
            default:
                System.out.print("bhagggg");
                break;
        }

    }
    }