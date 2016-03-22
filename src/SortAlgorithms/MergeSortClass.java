package SortAlgorithms;

//@Author Sandeep Sasidharan

import java.util.Arrays;

public class MergeSortClass {
	
	public static void main(String[] args) {
		int[] intArr = {2,7,2,9,0,5,3,4,5,8};
		int[] result = MergeSortClass.mergeSort(intArr);
		System.out.println("Before Sort: "+Arrays.toString(intArr));
		System.out.println("After Sort: "+Arrays.toString(result));
	}
	
	public static int[] mergeSort(int[] intArr) {

		if(intArr.length<2){
			return intArr;
		}

		int[] result = new int[intArr.length];
		int midpoint = intArr.length/2;
		int[] left = new int[midpoint];
		for(int i=0;i<midpoint;i++){
			left[i] = intArr[i];
		}
		int[] right;
		/*
		 * Can be replace by: right = new int[intArr.length - left.length];
		 * 
		 * */
		if(intArr.length%2==0){
			right = new int[midpoint];

		}else{
			right = new int[midpoint+1];
		}
		for(int i=midpoint;i<intArr.length;i++){
			right[i-midpoint] = intArr[i];
		}
		left = mergeSort(left);
		right = mergeSort(right);
		result = merge(left,right);
		return result;
	}

	private static int[] merge(int[] left, int[] right) {

		int[] mergedArr = new int[left.length+right.length];
		int indexL=0;
		int indexR=0;
		int indexRes = 0;

		//Check if left or right has elements
		while(indexL<left.length || indexR<right.length){
			if(indexL<left.length && indexR<right.length){
				if(left[indexL]<=right[indexR]){
					mergedArr[indexRes] = left[indexL];
					indexL++;
					indexRes++;
				}else{
					mergedArr[indexRes] = right[indexR];
					indexR++;
					indexRes++;
				}
			}
			//if there are remains in left or right, then just copy
			else if(indexL<left.length){
				mergedArr[indexRes] = left[indexL];
				indexL++;
				indexRes++;
			}
			else if (indexR<right.length){
				mergedArr[indexRes] = right[indexR];
				indexR++;
				indexRes++;
			}
		}
		return mergedArr;
	}

}
