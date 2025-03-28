// public class quest1046{
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 5, 4, 5, 3, 4 ,1};
//         findUnique(arr);


       
       
           
//         }
//         static int findUnique(int[] arr) {
//             int result = 0;
//             for (int num : arr) {
//                 result ^= num;  
//             }
//             int setBit = result & ~(result - 1);
//             int x = 0, y = 0;
//             for (int num : arr) {
//                 if ((num & setBit)!= 0)
//                     x ^= num;
//                 else
//                     y ^= num;
//             }
//             System.out.println("First non-repeating element is " + x);
//             System.out.println("Second non-repeating element is " + y);
//             return 0;
            
//     }
// }
        
//    using the priority queue
    

// 1046 question by priority queue leetcode question
// 1046. Last Stone Weight

// import java.util.*;

// public class LastStoneWeight {

//     public static int lastStoneWeight(int[] stones) {
 



