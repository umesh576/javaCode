package Threadlearn;

 class SleepMethods extends Thread {
    public void run(){
        String str = Thread.currentThread().getName();
        try{
            for(int i = 0; i<5;i++){
                System.out.println(str);
                Thread.sleep(2000);
            }

        }catch(Exception e){
        System.out.println("error"+e);
        }
    }
    
}
public class SleepMethod {
    public static void main(String args[]){
        SleepMethods st = new SleepMethods();
        SleepMethods st1 = new SleepMethods();
        // SleepMethods st2 = new SleepMethods();
        st.setName("Thread");
        st1.setName("Thread");
        st.start();
        st1.start();
    }


    
}
