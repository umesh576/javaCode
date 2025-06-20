package javaLearn;
public class Oops {
    int x = 3;

     Oops(int y){
        System.out.print("hello umesh "+y);
    }
    public static void main(String[] args){

        Oops op = new Oops(8);
        System.out.print("\n"+op.x);
    }
}
