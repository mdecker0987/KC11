import java.util.Scanner;


public class Introduction {
   public static void main(String[] args) {
   
   Scanner kb = new Scanner(System.in);

   System.out.println("What is your name?");
   
   String name = kb.next();
   
   System.out.println("Hi, " + name + "!");
   
   }
   
   
}