import com.sort.algo.BasicSorting;
import com.sort.algo.MergeSorting;

public class SortingExample {

	public static void main(String[] args) {

		int[] inputArray = new int[] { 2, 7, 5, 1, 3, 4 };

		System.out.println("Before Sorting:");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]);
		}

		System.out.println("\nAfter Selection Sorting:");

		for (int i = 0; i < BasicSorting.selectionSort(inputArray).length; i++) {
			System.out.print(inputArray[i]);
		}
		
		inputArray = new int[] { 2, 7, 5, 1, 3, 4 };
		
		System.out.println("\nAfter Bubble Sorting:");

		for (int i = 0; i < BasicSorting.bubbleSort(inputArray).length; i++) {
			System.out.print(inputArray[i]);
		}
		
		inputArray = new int[] { 2, 7, 5, 1, 3, 4 };
		System.out.println("\nAfter Insertion Sorting:");

		for (int i = 0; i < BasicSorting.insertionSort(inputArray).length; i++) {
			System.out.print(inputArray[i]);
		}
		
		inputArray = new int[] { 2, 7, 5, 1, 3, 4 };
		System.out.println("\nAfter Merge Sorting:");

		for (int i = 0; i < MergeSorting.mergeSort(inputArray).length; i++) {
			System.out.print(inputArray[i]);
		}
	}

}
