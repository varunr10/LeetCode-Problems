package arrays;

import java.util.ArrayList;
import java.util.List;
//Negative Marking to find duplicates and find missing in a range of elements in array
public class FindTheDuplicateNumbers {
	public static List<Integer> findDuplicates(int[] nums) {

		List<Integer> result = new ArrayList<>();

		for(int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if(nums[index] > 0) {
				nums[index] *= -1;
			} else {
				result.add(Math.abs(nums[i]));
			}
		}

		return result;
	}
	public static void main(String[] args) {
		List<Integer> duplicateNumbers = findDuplicates(new int[] {4,2,3,1,7,8,2,3});
		duplicateNumbers.forEach(System.out::println);
	}
}
