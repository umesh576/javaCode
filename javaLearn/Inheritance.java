package javaLearn;
 class  Car {
     void detail(){
        System.out.println("Every car have three wheel and one straing.");
    }

    
}

 class Toyota extends Car{
     void t_d(){
        System.out.println("This is derivied class or child class.");
        detail();
    }
}

public class Inheritance {
    public static void main(String[] args){
        Toyota t = new Toyota();
        t.t_d();
        t.detail();
    }
    
}

