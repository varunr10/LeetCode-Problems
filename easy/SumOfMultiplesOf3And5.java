/* 
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 */
public class SumOfMultiplesOf3And5 {

	public static int calculateSum(int number) {
		int sumOfAllMultiples = 0;
		number -= 1;
		for(int i = number ; i > 0; i--){
			if(number % 3 == 0 || number % 5 == 0){
				sumOfAllMultiples += number;
			}
			number -= 1;
		}
		return sumOfAllMultiples;

	}
	public static void main(String[] args) {

		System.out.println(calculateSum(10));

	}
}
