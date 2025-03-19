
// 73. Set Matrix Zeroes
class Solution {
    public static void main(String[] args) {
        public void setZeroes(int[][] matrix) {
            int m = matrix.length; // Number of rows
            int n = matrix[0].length; // Number of columns
    
            int[] row = new int[m]; // Track rows with zero
            int[] col = new int[n]; // Track columns with zero
    
            // Identify rows and columns that need to be zeroed
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(matrix[i][j] == 0){
                        row[i] = 1;
                        col[j] = 1;
                    }
                }
            }
    
            // Set corresponding rows to zero
            for(int i = 0; i < m; i++){
                if(row[i] == 1){
                    for(int j = 0; j < n; j++){
                        matrix[i][j] = 0;
                    }
                }
            }
    
            // Set corresponding columns to zero
            for(int j = 0; j < n; j++){
                if(col[j] == 1){
                    for(int i = 0; i < m; i++){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
    
    
    }
   