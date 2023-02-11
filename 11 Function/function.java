import java.util.*;

public class function{
    public static void PrintMyName(String name){
    System.out.println("Hello! "+name);
    return;
    }
public static void main(String args[]){
    System.out.print("What is your First Name: ");
    Scanner  sc = new Scanner(System.in);
    String name = sc.next();
    PrintMyName(name);
    }
}