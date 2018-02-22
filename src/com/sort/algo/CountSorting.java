package com.sort.algo;

public class CountSorting {

	public static int[] countSort(int[] inputArray, int startRange, int endRange){
		
		return countAlgo(inputArray, startRange, endRange);
	}
	
	private static int[] countAlgo(int[] inputArray, int startRange, int endRange){
		
		int[] counterArray = new int[endRange - startRange];
		
		int[] sortedArray = new int[inputArray.length];
		
		// count no of occurences of each digit
		for(int i = 0; i < inputArray.length; i++){
			counterArray[inputArray[i] - startRange]++;
		}
		
		// update counter by adding previous index count
		for(int i = 1; i < counterArray.length; i++){
			counterArray[i] += counterArray[i - 1];
		}
		
		// create new sorted array
		for(int i = 0; i < inputArray.length; i++){
			sortedArray[counterArray[inputArray[i] - startRange] - 1] = inputArray[i];
			counterArray[inputArray[i] - startRange]--;
		}
		
		return sortedArray;
	}
}
