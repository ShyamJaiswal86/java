

public class Example2 {
    public static void main(String args[]) {
       
            StringBuilder sc = new StringBuilder("tony");
            //Insert char
            sc.insert(0, 'S');
            System.out.println(sc);
        
           //delete char
            sc.delete(0, 1);
            System.out.println(sc);

            //Append a char
            sc.append(" Stark");
            System.out.println(sc);

            // Print Length of String
            System.out.println(sc.length());
      }
   
}
