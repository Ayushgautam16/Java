// import java.util.*;

// public class practice{
//     public static void main(String[] args){
// int count =0;

//         Scanner sc = new Scanner(System.in)
//         while(sc.hasNextLine()){
// count ++;
// String str = sc.nextLine();
// System.out.println(count +" " +str);
//         }
// sc.close();
        
//     }
// }


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
       
        for(int i=0; i<=t; i++){
            try{
                int b = sc.nextInt();
                int h = sc.nextInt();
                System.out.println(h*b);
                if(b>=-100&&b<=100)
                System.out.println(h*b);
                if(h>=-100&&h<=100)
                System.out.println(h*b);
            }
            catch(Exception e){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
            
        }
        
    }
}






This problem follows a specific pattern where we generate a series using the given parameters 

import java.util.Scanner;

public class SeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // Number of queries

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (int) Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();  // Move to the next line after each series
        }
        scanner.close();
    }
}
