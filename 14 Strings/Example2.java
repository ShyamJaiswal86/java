// Compare 2 strings

public class Example2 {
   public static void main(String args[]) {
       String name1 = "Tony";
       String name2 = "Tony";
 
        //Compare
        // case1 s1 > s2 : return +ve value
        // case2 s1 == s2 : return 0
        // case3 s1 < s2 : return -ve value
        // eg hello & bello hear hello is greater
        
        if(name1.compareTo(name2)==0) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

       if(name1.equals(name2)) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }
 
       //DO NOT USE == to check for string equality
       //Gives correct answer here
       if(name1 == name2) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }
 
       //Gives incorrect answer here
       if(new String("Tony") == new String("Tony")) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }
      
   }
}
