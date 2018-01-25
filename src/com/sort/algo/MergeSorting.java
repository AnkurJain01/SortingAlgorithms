package com.sort.algo;

public class MergeSorting {

	public static int[] mergeSort(int[] inputArray){
		mergeAlgo(inputArray);
		return inputArray;
	}
	
	private static void mergeAlgo(int[] inputArray){
		if(inputArray.length < 2)
			return;
		int size = inputArray.length;
		int mid = size /2;
		int leftSize = mid;
		int rightSize = size - mid;
		
		int[] left = new int[leftSize];
		for(int i=0; i<leftSize; i++){
			left[i] = inputArray[i];
		}
		
		int[] right = new int[rightSize];
		for(int i=0; i<rightSize; i++){
			right[i] = inputArray[mid + i];
		}
		
		mergeAlgo(left);
		mergeAlgo(right);
		
		mergeSubArray(left, right, inputArray);
		left = null;
		right = null;
	}

	private static void mergeSubArray(int[] left, int[] right, int[] inputArray) {

		int i=0;
		int j=0;
		int k=0;
		
		while(i<left.length && j < right.length){
			if(left[i] < right[j]){
				inputArray[k] = left[i];
				i++;
			}else{
				inputArray[k] = right[j];
				j++;
			}
			
			k++;
		}
		
		while(i<left.length){
			inputArray[k] = left[i];
			i++;
			k++;
		}
		
		while(j<right.length){
			inputArray[k] = right[j];
			j++;
			k++;
		}
	}
}
