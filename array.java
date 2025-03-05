// public class array {
//     // public static void main(String[]args){
//     //     int nums[] = {1,2,3,4,5,6,7,8};
//     //     nums[4] =0;
//     //     System.out.println(nums[1]);
//     //     System.out.println(nums[4]);

//     //     for(int i=0; i<nums.length; i++){
//     //         System.out.println(nums[i] + " array hai ye");
//     //     }

//     // }


//     int arr[][] = new int [3][5];

//     for(int i=0; i<=3; i++)
//     {
//         for(int j=0; j<=5; j++){
//             System.out.println(arr[i][j] + " array");
//         }
//     }




// }


// multidimensional array###########

// class array{
//     public static void main(String[]args){
//         int arr[][] = new int [3][5];

//         for(int i=0; i<3; i++)
//         {
//             for(int j=0; j<5; j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//     }
// }


// jagged array ###########

// class array{
//     public static void main(String[]args){
//         int arr [][] = new int [3][];

//         arr[0] = new int[5];
//         arr[1] = new int[3];
//         arr[2] = new int[4];

//         for(int i=0; i<3; i++)
//         {
//             for(int j=0; j<arr[i].length; j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// 3d array @@@@@@@ 
class array {
    public static void main(String[] args) {
        int arr[][][] = new int[3][3][5]; // Fixed semicolon

        for (int i = 0; i < 3; i++) { // Fixed loop condition
            for (int j = 0; j < 3; j++) { // Fixed loop condition
                for (int k = 0; k < 5; k++) { // Fixed loop condition
                    System.out.print(arr[i][j][k] + " "); // Fixed typo (use print instead of println)
                }
                System.out.println(); // Move to next line after inner loop
            }
            System.out.println("-----------------------------");
        }
    }
}

// drawbacks of array #############/

// 1. fixed size: once an array is declared, its size cannot be changed.

// 2. lack of random access: unlike linked lists or arrays, in arrays, you can only access elements by their index.

// 3. inefficient search and insertion: searching or inserting an element in an array requires shifting all the elements after it.

// 4. limited memory: arrays require contiguous memory space, which can lead to memory fragmentation if the array is not used efficiently.

