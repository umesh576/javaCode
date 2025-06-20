public class Method {

    static void sum(int x, int y){
        System.out.println(x+y);
    }
    static void sum(int x, int y, int z){
        System.out.println(x+y+z);
    }
    static int sub(){
        return 5-3;
    }
   public static  void main(String[] args){

    sum(2,3);
    sum(2,3,9);
    System.out.println(sub());

    }    
}
