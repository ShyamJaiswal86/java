//Print sum of n numbers Enert By User;
import java.util.*;
public class practice {
    public static void main(String[] args){
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0, sum = 0;
        while(i <= n){
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of "+n+" = "+sum);
    }
}
