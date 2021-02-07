package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for(int i=array.length-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				int temp = array[j];
				if(temp>array[j+1]) {
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			display.updateDisplay();
		}
		
	}
	
}
