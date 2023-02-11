
// Check That Entered Number is Equal/Greater/Lesser

import java.util.*;
public class Practice2 {
    public static void main(String[] args) {

        System.out.print("Enter 1st Number: ");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();

        System.out.print("Enter 2nd Number: ");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();

        if(num1 == num2){
            System.out.println(num1 +" Is Equal To " + num2);
        }else{
            if(num1 > num2){
                System.out.println(num1 +" Is Greater Then " + num2);
            }else{
                System.out.println(num2 +" Is Greater Then " + num1);
            }
        
        }
        sc1.close();
        sc2.close();
    }
}
