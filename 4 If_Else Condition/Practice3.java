
// Check That Entered Number is Equal/Greater/Lesser

import java.util.*;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println(num1 +" Is Equal To " + num2);
        }else if(num1 > num2){
            System.out.println(num1 +" Is Greater Then " + num2);
        }else{
            System.out.println(num2 +" Is Greater Then " + num1);
            }
            sc.close();
    }
}
