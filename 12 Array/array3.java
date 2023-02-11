import java.util.*;

public class array3 {
    public static void main(String args[]){
        System.out.print("Enter a size of an Array: ");
        Scanner sc = new Scanner(System.in);
        int size =  sc.nextInt();
        int numbers[] = new int[size];
        //input
        System.out.print("Enter an "+size+" Input: ");
        for(int i =0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        //output
        System.out.print("Data inside Array are: ");
        for(int i = 0;i<size;i++){
            System.out.print(numbers[i]+" ");
        }
}
}