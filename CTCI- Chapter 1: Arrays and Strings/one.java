// Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
package sol.chapter1;
import java.util.*;
class one{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        // If we can use additional data structure:
        HashSet<Character> hm = new HashSet<Character>();

        for(char c: s.toLowerCase().toCharArray()){
            if(hm.contains(c)){
                System.out.println("Not Unique");
                System.exit(0);
            }
            hm.add(c);
        }
        System.out.println("Unique");
    }
}