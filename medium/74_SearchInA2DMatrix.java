package arrays;

public class Search2DMatrix {
	public static boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length == 0)
			return false;
		if(matrix[0].length == 1 && matrix[0][0] == target)
			return true;

		int rowLength = matrix[0].length;
		int colLength = matrix.length;
		int i = 0;
		int j = rowLength - 1;

		while(i < colLength && j >= 0) {
			if(target == matrix[i][j])
				return true;
			else if( target > matrix[i][j])
				i++;
			else if(target < matrix[i][j])
				j--;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[][] input = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int[][] input1 = new int[][]{{1}};
		System.out.println(searchMatrix(input1,3));
	}
}
