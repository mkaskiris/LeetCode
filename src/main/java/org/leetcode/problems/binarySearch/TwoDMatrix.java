package org.leetcode.problems.binarySearch;

public class TwoDMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix[0].length;

        int lowRow = 0;
        int highRow = matrix.length-1;

        while(lowRow <= highRow) {
            int mid = (lowRow + highRow) / 2;
            if(matrix[mid][0] <= target && matrix[mid][rowLength-1] >= target) {

                int lowCol = 0;
                int highCol = matrix[0].length;

                while(lowCol <= highCol) {
                    int midCol = (lowCol + highCol) / 2;
                    if(matrix[mid][midCol] == target) {
                        return true;
                    }else if(matrix[mid][midCol] > target){
                        highCol = midCol - 1;
                    }else{
                         lowCol = midCol + 1;
                    }
                }
                return false;
            }else if(matrix[mid][0] > target) {
                highRow = mid - 1;
            }else{
                lowRow = mid + 1;
            }
        }
        return false;
    }
}
