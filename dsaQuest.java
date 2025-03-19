// class dsaQuest {
    // public static void main(String[] args) {
    //     // Question 1
    //     System.out.println("Question 1: ");
    //     int[] arr = {1, 2, 3, 4, 5};
    //     int target = 5;
    //     int[] result = twoSum(arr, target);
    //     System.out.println("Indices: " + result[0] + ", " + result[1]);

    //     // Question 2
    //     System.out.println("Question 2: ");
    //     int[] nums = {1, 2, 3, 4, 5};
    //     int k = 2;
    //     rotate(nums, k);
    //     for(int i = 0; i < nums.length; i++){
    //         System.out.print(nums[i] + " ");
    //     }
    //     System.out.println();

    //     // Question 3
    //     System.out.println("Question 3: ");
    //     int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
    //     setZeroes(matrix);
    //     for(int i = 0; i < matrix.length; i++){
    //         for(int j = 0; j < matrix[0].length; j++){
    //             System.out.print(matrix[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length; // Number of rows
//         int n = matrix[0].length; // Number of columns

//         int[] row = new int[m]; // Track rows with zero
//         int[] col = new int[n]; // Track columns with zero

//         // Identify rows and columns that need to be zeroed
//         for(int i = 0; i < m; i++){
//             for(int j = 0; j < n; j++){
//                 if(matrix[i][j] == 0){
//                     row[i] = 1;
//                     col[j] = 1;
//                 }
//             }
//         }

//         // Set corresponding rows to zero
//         for(int i = 0; i < m; i++){
//             if(row[i] == 1){
//                 for(int j = 0; j < n; j++){
//                     matrix[i][j] = 0;
//                 }
//             }
//         }

//         // Set corresponding columns to zero
//         for(int j = 0; j < n; j++){
//             if(col[j] == 1){
//                 for(int i = 0; i < m; i++){
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }
// }
