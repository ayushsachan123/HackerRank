import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a%2==1){
            System.out.println("Weird");
        }
        else{
        if(a>=2&&a<=5){
            System.out.println("Not Weird");
        }
        else if(a>=6 && a<=20){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
        }
        
    }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Input--
// 3
// Output--
// Weird
