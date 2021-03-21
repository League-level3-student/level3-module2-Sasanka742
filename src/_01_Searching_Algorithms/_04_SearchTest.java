package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] unsorted = {"one", "two", "three", "four", "five", "six"};
		String value = "five";
		
		assertEquals(4, _00_LinearSearch.linearSearch(unsorted, value));
		value = "one";
		assertEquals(0, _00_LinearSearch.linearSearch(unsorted, value));
		value = "seven";
		assertEquals(-1, _00_LinearSearch.linearSearch(unsorted, value));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] sorted = {0, 1, 2, 3, 4, 5};
		int start = 0;
		int end = sorted.length; 
		int value = 4;
		
		assertEquals(4, _01_BinarySearch.binarySearch(sorted, start, end, value));
		value = 0;
		assertEquals(0, _01_BinarySearch.binarySearch(sorted, start, end, value));
		value = 10;
		assertEquals(-1, _01_BinarySearch.binarySearch(sorted, start, end, value));
		
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] sorted = {100, 200, 300, 400, 500};
		int value = 300;
		
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(sorted, value));
		value = 500;
		assertEquals(4, _02_InterpolationSearch.interpolationSearch(sorted, value));
		value = 1000;
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(sorted, value));
		
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] sorted = {0, 1, 2, 3, 4,7,9,10};
		int value = 9;
		
		assertEquals(6, _03_ExponentialSearch.exponentialSearch(sorted, value));
		value = 10;
		assertEquals(7, _03_ExponentialSearch.exponentialSearch(sorted, value));
		value = 12;
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(sorted, value));
		
		
		
	}
}
