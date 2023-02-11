
// Make a Function to find the Factorial of a Number

import java.util.*;

public class Practice3 {
    public static int Factorial(int a){
        int fact = 1;
        for(int i = 1;i <=a ; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Factorial of " + a + " = " + Factorial(a));
    } 
}
