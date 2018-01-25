package com.sort.algo;

public class BasicSorting {

	public static int[] selectionSort(int[] inputArray) {

		for (int i = 0; i < inputArray.length - 1; i++) {

			int minIndex = i;

			for (int j = i; j < inputArray.length; j++) {
				if (inputArray[j] < inputArray[minIndex]) {
					minIndex = j;
				}
			}

			int temp = inputArray[minIndex];
			inputArray[minIndex] = inputArray[i];
			inputArray[i] = temp;
		}

		return inputArray;
	}

	public static int[] bubbleSort(int[] inputArray) {

		for (int i = 0; i < inputArray.length - 1; i++) {

			boolean hasSwapped = false;
			for (int j = 0; j < inputArray.length -i-1; j++) {
				
				if (inputArray[j] > inputArray[j + 1]) {
					int temp = inputArray[j];
					inputArray[j] = inputArray[j+1];
					inputArray[j+1] = temp;
					hasSwapped = true;
				}
			}
			
			if(!hasSwapped)
				break;
		}

		return inputArray;
	}

	public static int[] insertionSort(int[] inputArray) {

		for (int i = 1; i < inputArray.length; i++) {

			int value = inputArray[i];
			int index = i;
			
			while(index > 0 && inputArray[index - 1] > value){
					inputArray[index] = inputArray[index - 1];
					index--;
			}
			
			inputArray[index] = value; 
		}

		return inputArray;
	}
}
