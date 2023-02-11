import java.util.*;
public class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Full Name: ");
        String name = sc.nextLine();
        System.out.println("Hello! "+name);
        sc.close();
    }
}
//next - for only one word
//nextLine - for a whole line
//nextInt - for int
//nextFloat - for float
//nextDouble - 
