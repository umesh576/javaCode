
 interface InterfaceClass {
    
    final int a =10;
    void readbook();

    
}

public class Interface implements InterfaceClass{
    public void readbook(){
        System.out.println("I am reading book");
    }
    public static void main(String[] args){

        Interface i = new Interface();

        i.readbook();
        
    }
}