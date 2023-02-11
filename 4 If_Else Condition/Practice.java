
// Check That Entered Number is Odd or Even

import java.util.*;
public class Practice {
    public static void main(String[] args) {

        System.out.print("Enter Your Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }
    sc.close();
    }
}
