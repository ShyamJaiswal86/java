
// Make a Function to add 2 numbers and return the sum

import java.util.*;

public class Practice {
    public static int addNum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]){
        System.out.print("Enter Two Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Sum of " + a + " + " + b + " = " + addNum(a, b));
    } 
}
