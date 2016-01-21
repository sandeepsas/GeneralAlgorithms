package SortAlgorithms;

public class NSquareSort {

	public static int[] findNSquareSort(int[] anArray){

		for(int i=0;i<anArray.length;i++){
			for(int j=0;j<anArray.length;j++){
				if(anArray[i]>anArray[j]){
					anArray[i]=anArray[j]+anArray[i];
					anArray[j]=anArray[i]-anArray[j];
					anArray[i]=anArray[i]-anArray[j];
				}
			}
		}
		return anArray;
	}

	public static int[] removeDuplicate(int[] anArray){

		for(int i=0;i<anArray.length;i++){
			for(int j=i+1;j<anArray.length-1;j++){
				
				if(anArray[i]==anArray[j]){
					anArray = pushArray(j,anArray);
					removeDuplicate(anArray);
				}

			}

		}
		return anArray;

	}
	
	public static int[] pushArray(int k,int[] anArray){
		int[] dup = new int[anArray.length-1];
		
		for(int m=0;m<k;m++){
			dup[m] = anArray[m];
		}
		
		for(int m=k+1;m<anArray.length;m++){
			dup[m-1]=anArray[m];
		}
		return dup;
		
	}

}
