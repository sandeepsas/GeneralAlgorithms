package TestCases;

import java.util.Arrays;

import SortAlgorithms.MergeSortClass;

public class TMergeSort {

	public static void main(String[] args) {
		int[] intArr = {2,7,2,9,0,5,3,4,5,8};
		int[] result = MergeSortClass.mergeSort(intArr);
		System.out.println("Before Sort: "+Arrays.toString(intArr));
		System.out.println("After Sort: "+Arrays.toString(result));
	}
}
