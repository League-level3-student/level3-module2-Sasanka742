package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	public static boolean intArraySorted(int[] nums) {
		int zero = nums[0];
		for(int i=1;i<nums.length;i++) {
			if(zero>nums[i]) {
				return false;
			}
			zero = nums[i];
		}
		return true;
		
	}
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	
	public static boolean doubleArraySorted(double[] nums) {
		double zero = nums[0];
		
		for(int i=1;i<nums.length;i++) {
			if(zero>nums[i]) {
				return false;
			}
			zero = nums[i];
		}
		return true;
	}
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise

	public static boolean charArraySorted(char[] chars) {
		char zero = chars[0];
		for(int i=1;i<chars.length;i++) {
			if(zero>chars[i]) {
				return false;
			}
			zero = chars[i];
		}
		return true;
	}
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)

	public static boolean stringArraySorted(String[] wrds) {
		String zero = wrds[0];
		for(int i=1;i<wrds.length;i++) {
			for(int j=0;j<zero.length();j++) {
				if(zero.charAt(j)>wrds[i].charAt(j)) {
					return false;
				}else {
					break;
				}
			}
			zero = wrds[i];
		}
		return true;
	}
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)

}
