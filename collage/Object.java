public class Object{
    int x = 10;
    int y = 30;
    static public void main(String[] args){
        Object obj = new Object();
        Object obj1 = new Object();
        System.out.print(obj.x + obj1.y);
    }
}