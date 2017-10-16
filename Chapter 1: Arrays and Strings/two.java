package sol.chapter1;

import java.util.*;
class two{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter String 2: ");
        String s2 = sc.nextLine();

        Map<Character, Integer> hm1 = new HashMap<Character,Integer>();
        Map<Character, Integer> hm2 = new HashMap<Character,Integer>();

        for(char c: s1.toCharArray()){
            int temp = hm1.get(c)==null? 1: (hm1.get(c)+1);
            hm1.put(c,temp);
        }
        for(char c: s2.toCharArray()){
            int temp = hm2.get(c)==null? 1: (hm2.get(c)+1);
            hm2.put(c,temp);
        }

        if(hm1.equals(hm2)){
            System.out.println("Permutation");
        }else{
            System.out.println("Not a Permutation of each other");
        }
    }
}