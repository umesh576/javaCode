package execption;

public class NestedException {
    public static void main(String[ ] args) {
    try {
      int myNumbers[] = {1, 2, 3};
      System.out.println(myNumbers[1]);
      try{
        int myNumbers1[] = {1, 2, 3};
      System.out.println(myNumbers1[10]);

      }catch(Exception e){
              System.out.println(e);

      }
    } catch (Exception e) {
      System.out.println("Something went wrong.");
      System.out.println(e);
    }finally{
      System.out.println("hello");
    }
  }
    
}
