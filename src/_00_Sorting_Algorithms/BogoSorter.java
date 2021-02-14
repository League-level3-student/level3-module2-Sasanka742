package _00_Sorting_Algorithms;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BogoSorter extends Sorter {
	
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for(int i=array.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(array[j]>array[j+1]) {
					int rand =  new Random().nextInt(array.length);
					int temp = array[rand];
					int	rand2 =  new Random().nextInt(array.length);
					array[rand] = array[rand2];
					array[rand2] = temp;
				}
				display.updateDisplay();
			}
		}
	}
	
}
