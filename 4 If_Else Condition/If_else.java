import java.util.*;

public class If_else {
    public static void main(String args[]){
        System.out.print("Enter Your Age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("You Are Adult");
        }else {
            System.out.println("You Are Not Adult");
        }
        sc.close();
    }
}

