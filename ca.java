import java.util.*;
 
public class ca
{
    // Function to find second most frequent character
    public static char secondMostFrequent(String str)
    {
        // HashMap to store character and its frequency
        Map<Character, Integer> hm = new HashMap<Character, Integer>();
 
        // length of string
        int len = str.length();
 
        // loop to build character frequency hash map
        for (int i = 0; i < len; i++)
        {
            char c = str.charAt(i);
            if (hm.containsKey(c))
            {
                hm.put(c, hm.get(c) + 1);
            }
            else
            {
                hm.put(c, 1);
            }
        }
 
        // create an ArrayList to sort characters
        // based on frequency
        List<Map.Entry<Character, Integer> > list = 
            new ArrayList<Map.Entry<Character, Integer> >(hm.entrySet());
 
        // sort the list
        {
    
}
    }
}
