class Solution {
    public void setZeroes(int[][] matrix) {
                
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();
        
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                
                if(matrix[i][j] == 0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
       
        for(int row: rowSet) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
            }
        }
        
        for(int col: colSet) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }
        
    }
}
