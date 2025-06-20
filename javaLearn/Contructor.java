package javaLearn;
public class Contructor {

    int x ;
     Contructor(){
        x = 10;
    }
    Contructor(int z){
        System.out.println(z);
    }
    public static void main(String[] args){
        Contructor c = new Contructor(20);
        System.out.println(c.x);
    }
    
}
