// import java.util.*;
// class XOR{
//     static int findUnique(int[] arr) {
//         int result = 0;
//         for (int num : arr) {
//             result ^= num;  // XOR operation to find the unique element
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 3, 5, 4, 5, 3, 4};
//         System.out.println(findUnique(arr));
//     }
// }




// fint two non repeating elements int he array 


// import java.util.*;
// class XOR{
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 5, 4, 5, 3, 4 ,1};
//         findUnique(arr);
        
//     }
//     static int findUnique(int[] arr) {
//         int result = 0;
//         for (int num : arr) {
//             result ^= num;  // XOR operation to find the unique element
//         }
//         int setBit = result & ~(result - 1);
//         int x = 0, y = 0;
//         for (int num : arr) {
//             if ((num & setBit)!= 0)
//                 x ^= num;
//             else
//                 y ^= num;
//         }
//         System.out.println("First non-repeating element is " + x);
//         System.out.println("Second non-repeating element is " + y);
//         return 0;
       
    
//     }
// }


3. Find a Bit That Differentiates x and y
java
Copy
Edit
int setBit = result & ~(result - 1);
This extracts the rightmost set bit from result.

result - 1 flips the rightmost 1 in result, and ~(result - 1) isolates it.

Example:

yaml
Copy
Edit
result = 3  →  0000 0011 (Binary)
result - 1 = 2  → 0000 0010
~(result - 1)   → 1111 1101
setBit = 3 & ~(2) → 0000 0011 & 1111 1101 = 0000 0001
This tells us that x and y differ at the rightmost bit.




// }

