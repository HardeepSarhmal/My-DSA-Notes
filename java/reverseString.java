import java.util.Scanner;
import java.util.*;

public class reverseString {
    public static void main (String [ ]args){
        System.out.println("enter your line");

    Scanner sc =  new Scanner(System.in);
   
    String name = sc.nextLine();
     StringBuilder sb = new StringBuilder(name);

   
     for (int i =0; i<sb.length()/2; i++){
        int front = i;
        int back = sb.length()-1-i;

        char frontChar = sb.charAt(front);
        char backChar = sb.charAt(back);
        sb.setCharAt(front, backChar);
        sb.setCharAt(back, frontChar);
        
    }
    System.out.print("your reverse string is >>> "+ sb);
}
}
