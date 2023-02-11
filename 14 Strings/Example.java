

public class Example {
    public static void main(String[] args){

   // Concatenation (Joining 2 strings)
    String firstName = "Tony";
           String secondName = "Stark";
     
           String fullName = firstName + " " + secondName;
           System.out.println(fullName); 
   
    //Print length of a String        
           System.out.println(fullName.length());
    
    //Access characters of a string
           for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
    }

}
}
