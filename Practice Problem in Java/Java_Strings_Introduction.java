import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int count=0;
        int sum=0;
        for(int i=0;i<A.length();i++){
            count++;
        }
        for(int j=0;j<B.length();j++){
            sum++;
        }
        System.out.println(count+sum);
         if(A.compareTo(B)<=0){
         System.out.println("No");
         }
            else {
                System.out.println("Yes");
            }
             System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)+" "+B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}



