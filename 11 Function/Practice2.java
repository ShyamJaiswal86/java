
// Make a Function to add,sub,mul,div 2 numbers and return the sum

import java.util.*;

public class Practice2 {
    public static int addNum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int subNum(int a, int b){
        int sum = a - b;
        return sum;
    }
    public static int divNum(int a, int b){
        int sum = a / b;
        return sum;
    }
    public static int mulNum(int a, int b){
        int sum = a * b;
        return sum;
    }
    public static void main(String args[]){
        System.out.print("Enter Two Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum of " + a + " + " + b + " = " + addNum(a, b));
        System.out.println("Sub of " + a + " - " + b + " = " + subNum(a, b));
        System.out.println("Div of " + a + " / " + b + " = " + divNum(a, b));
        System.out.println("Mul of " + a + " * " + b + " = " + mulNum(a, b));
    } 
}
