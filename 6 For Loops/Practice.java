//Print a Table of Number Entered by User

import java.util.*;
public class Practice {
    public static void main(String[] args){
        System.out.print("Enter a Number to get a Table: ");
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int i, mul = 0;
        for(i =1;i<= 10;i++){
            mul = n *i;
            System.out.println(n + " X "+ i +" = " + mul);
        }
    }
}
    

