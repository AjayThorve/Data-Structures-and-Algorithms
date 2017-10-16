package sol.chapter1;

import java.util.*;
class three{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter truelength: ");
        int truelength = sc.nextInt();

        char[] sol = s1.toCharArray();
        StringBuilder s2= new StringBuilder("");

        for(int i=0;i<truelength;i++){
            
            if(Character.isWhitespace(sol[i])){
                s2.append("%20");
            }else{
                s2.append(sol[i]);
            }

        }
        System.out.println(s2);
    }
}