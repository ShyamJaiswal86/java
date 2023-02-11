// Check That Entered Number is Equal/Greater/Lesser

import java.util.*;
public class switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1/2/3: ");
        int num1 = sc.nextInt();
    
    switch (num1) {
        case 1:  System.out.println("Hello");
        break;
        case 2:  System.out.println("Namaste");
        break;
        case 3:  System.out.println("Pranam");
        break;
        default: System.out.println("Invalid Numbers");
        break;
    }
    sc.close();
    }
}