package Thread;


class Program1 extends Thread{
    
    public void run(){
        String str = "Thread is started running ...";
        System.out.println(str);
    }
}
class InnerProgram1 implements Runnable{
    @Override
public void run(){
    System.out.println("thread is running sucessfully");
}
    
}
public class Num1Program  {

    
    public static void main(String[] args) {
        Program1 p = new Program1();
        p.start();

        InnerProgram1 ip = new InnerProgram1();
        Thread t = new Thread(ip);
        t.start();
    }
}


