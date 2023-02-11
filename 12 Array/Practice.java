//Take an array of names as input from the user and print them on the screen.
import java.util.*;
 
public class Practice {
   public static void main(String args[]) {
      System.out.print("How Many Names do you want to Enter: ");
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      String names[] = new String[size];
 
      //input
      System.out.print("Enter names: ");
      for(int i=0; i<size; i++) {
          names[i] = sc.next();
      }
     
      //output
       for(int i=0; i<names.length; i++) {
           System.out.println("name " + (i+1) +" is : " + names[i]);
       }
      
   }
}
