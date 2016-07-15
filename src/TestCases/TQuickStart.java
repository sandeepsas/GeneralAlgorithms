package TestCases;

import java.util.*;

import SortAlgorithms.NSquareSort;

public class TQuickStart {

	public static void main(String[] args) {
		int[] intArr = {2,7,2,9,0,5,3,4,5,8};
		System.out.println("Before Sort: "+Arrays.toString(intArr));
		intArr = NSquareSort.removeDuplicate(intArr);
		intArr = NSquareSort.findNSquareSort(intArr);
		System.out.println("After Sort: "+Arrays.toString(intArr));
	}

}
