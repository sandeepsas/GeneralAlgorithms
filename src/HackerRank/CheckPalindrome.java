package HackerRank;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		System.out.println( A.equals( new StringBuilder(A).reverse().toString()) 
			    ? "Yes" : "No" );
/*		boolean flag = false;
		
		StringBuilder sb = new StringBuilder(A);
		System.out.println(sb);
		
		StringBuilder sb_rev = new StringBuilder(A).reverse();
		System.out.println(sb);
		System.out.println(sb_rev);
		
		if(!sb.equals(sb_rev))
			flag = true;*/
		/* Enter your code here. Print output to STDOUT. */
/*
		int j = A.length() -1;
		

		for(int i = 0;i<=A.length() -1;i++){
			if(A.charAt(i)!= A.charAt(j)){
				flag = true;
				break;
			}
			j--;
		}*/

		/*if(flag){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}*/
	}

}
