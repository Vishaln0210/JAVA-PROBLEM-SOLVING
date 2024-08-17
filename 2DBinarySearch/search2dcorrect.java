class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        
        int r = 0; 
        int c = colCount - 1;
        
        while (r < rowCount && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        
        return false;
    }
}
