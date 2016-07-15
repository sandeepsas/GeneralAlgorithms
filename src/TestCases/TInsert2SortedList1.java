// Uses two arrays
package TestCases;

import java.util.*;

public class TInsert2SortedList1 {

	public static void main(String[] args) {
		
		int [] inputArr = {1,2,3,4,6,7,9};
		System.out.println("Initial Array: "+Arrays.toString(inputArr));
		
		Scanner sc = new Scanner (System.in);
		
		int nb = sc.nextInt();
		System.out.println("Number to be Inserted : "+nb);
		
		int [] outArr = new int[inputArr.length+1];
		int flag =0;
		
		int j=0;
		
		for (int i=0;i<inputArr.length;i++){
			if(nb<inputArr[i] && flag == 0){
				outArr[j]=nb;
				flag = 1;
				j++;
				outArr[j]=inputArr[i];
			}
			outArr[j]=inputArr[i];
			j++;
			
		}
		System.out.println("Final Array: "+Arrays.toString(outArr));

	}

}
