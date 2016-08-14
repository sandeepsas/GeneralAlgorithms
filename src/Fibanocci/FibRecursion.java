package Fibanocci;

import java.util.*;

public class FibRecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
			System.out.println("Fib = "+fib(i));
		sc.close();

	}

	private static int fib(int n) {
		if(n < 2)
			return 1;
		
		return fib(n-1)+fib(n-2);
	}

}
