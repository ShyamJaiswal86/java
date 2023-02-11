import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        int a = s.nextInt();
        System.out.print("Enter Num2: ");
        int b = s.nextInt();
        int sum = a + b;
        System.out.println("Sum Of Two Number is = " + sum + ".");
        s.close();
    }
}
