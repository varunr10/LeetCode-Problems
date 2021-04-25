import java.util.ArrayList;

public class DeompressList {

	public static int[] decompress(int[] nums) {

		ArrayList<Integer> list = new ArrayList<>();

		for(int i = 1; i < nums.length; i+=2){

			int val = nums[i];
			int freq = nums[i-1];

			for(int j = 0; j < freq; j++){
				list.add(val);
			}

		}
		int len = list.size();
		int[] newArray = new int[len];
		for( int i = 0; i < len; i++) 
			newArray[i] = list.get(i);

		return newArray;

	}
	

	public static void main(String[] args) {
		System.out.println(decompress(new int[] {1,2,3,4}));
	}
}
