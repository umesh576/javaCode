package RandomLearn;
public class ClassMethod {

    public void message(){
        System.out.println("Good morning hii");
    }
    
    static void name(){
        // message();
        System.out.println("Good morning umesh");

    }

    public static void main(String[] args){

        ClassMethod cm = new ClassMethod();

        cm.message();
        name();
    }
    
}
