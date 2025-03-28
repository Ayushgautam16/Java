import java.util.*;

import javax.lang.model.util.Elements;

public class quest {
    // to convert the log base 2 10 to the power 4
    public static void main(String[] args) {
        // System.out.println(Math.log(10) / Math.log(2));
        // eithout built in function 
        // int n = 10;
        // double log = 0;
        // while (n > 1) {
        //     n /= 2;
        //     log++;
        // }
        // System.out.println(log);
    // }


    // // min heap 
    // int[] arr = {4, 10, 3, 5, 1, 7, 8, 6, 9};
    // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    // for (int num : arr) {    
    //     pq.add(num);
    // }
    // while (!pq.isEmpty()) {
    //     System.out.print(pq.poll() + " ");
    // }
    // System.out.println();
    // }



// 1464. Maximum Product of Two Elements in an Array
// Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

// solution


    }

}
public int maxProduct(int[] nums) {
    int max1 = 0, max2 = 0;
    for (int num : nums) {
        if (num > max1) {
            max2 = max1;
            max1 = num;
        } else if (num > max2 && num!= max1) {
            max2 = num;
        }
        System.out.println("maxProduct: " + max1 + " " + max2);
        System.out.println("max1: " + max1 + " max2: " + max2);
        



    }
    return (max1 - 1) * (max2 - 1);
}
