// import java.util.*;

// import javax.lang.model.util.Elements;

// public class quest {
//     // to convert the log base 2 10 to the power 4
//     public static void main(String[] args) {
//         // System.out.println(Math.log(10) / Math.log(2));
//         // eithout built in function 
//         // int n = 10;
//         // double log = 0;
//         // while (n > 1) {
//         //     n /= 2;
//         //     log++;
//         // }
//         // System.out.println(log);
//     // }


//     // // min heap 
//     // int[] arr = {4, 10, 3, 5, 1, 7, 8, 6, 9};
//     // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//     // for (int num : arr) {    
//     //     pq.add(num);
//     // }
//     // while (!pq.isEmpty()) {
//     //     System.out.print(pq.poll() + " ");
//     // }
//     // System.out.println();
//     // }



// // 1464. Maximum Product of Two Elements in an Array
// // Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

// // solution


//     }  

// }
// public int maxProduct(int[] nums) {
//     int max1 = 0, max2 = 0;
//     for (int num : nums) {
//         if (num > max1) {
//             max2 = max1;
//             max1 = num;
//         } else if (num > max2 && num!= max1) {
//             max2 = num;
//         }
//         System.out.println("maxProduct: " + max1 + " " + max2);
//         System.out.println("max1: " + max1 + " max2: " + max2);
        



//     }
//     return (max1 - 1) * (max2 - 1);
// }




// 2974. Minimum Number Game leetcode question 

// Alice and Bob are playing a game with an array nums consisting of even length. Alice and Bob take turns to move. In each move, they choose an integer from the array nums and remove it. The player who removes the last element wins the game.

// However, Alice and Bob are very good at math, so they are playing a modified version of the game. In this modified version, Alice and Bob have an additional constraint: they cannot choose the same element twice in a row.
// You are given a 0-indexed integer array nums of even length and there is also an empty array arr. Alice and Bob decided to play a game where in every round Alice and Bob will do one move. The rules of the game are as follows:

// 1. Choose an integer x from the array nums and remove it.

// 2. If x is not equal to the last element of arr, append x to arr. Otherwise, append x+1 to arr.

// 3. The player who removes the last element wins the game.


// Return the minimum number of moves Alice needs to win the game.

// Example 1:

// Input: nums = [1,3,5,2,4,6]
// Output: 3

// solution of 2974


public int getMinimumWinning(int[] nums) {

    int n = nums.length;

    int[] prefixSum = new int[n + 1];

    for (int i = 0; i < n; i++) {

        prefixSum[i + 1] = prefixSum[i] + nums[i];

    }

    int ans = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {

        for (int j = i + 1; j <= n; j++) {

            int sum = prefixSum[j] - prefixSum[i];
            int diff = Math.abs(prefixSum[n] - 2 * sum);
            ans = Math.min(ans, diff);
            System.out.println("diff: " + diff);
            System.out.println("ans: " + ans);
            if (diff == 0) {
                return 0;
            }
        }}