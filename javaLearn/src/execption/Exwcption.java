
public class Exwcption {
  public static void main(String[ ] args) {
    try {
      int myNumbers[] = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
      System.out.println(e);
    }finally{
      System.out.println("hello");
    }
  }
}