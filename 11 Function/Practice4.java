
// Make a Recursion Function to find the Factorial of a Number

import java.util.*;

public class Practice4 {
    public static int Factorial(int a){
        int num = a;
        if(num==0){
            return 1;
        }
        else{
            return(num*Factorial(num -1));
            }
        }
    public static void main(String args[]){
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Factorial of " + a + " = " + Factorial(a));

    } 
}

