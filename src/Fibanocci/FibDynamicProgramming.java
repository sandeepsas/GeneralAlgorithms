package Fibanocci;

import java.util.*;

public class FibDynamicProgramming {

	public static HashMap<Long, Long> fibMap = new HashMap<Long, Long> ();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		for(int i=0;i<n;i++)
			System.out.print(fib(i)+",");
		sc.close();

	}

	private static long fib(long n) {
		if(n < 2)
			return 1;
		long fib1 = 0;
		long fib2 = 0;
		if(fibMap.containsKey(n-2)){
			fib1 = fibMap.get(n-2);
		}else{
			fib1 = fib(n-2);
			fibMap.put(n-2, fib1);
		}
		if(fibMap.containsKey(n-1)){
			fib2 = fibMap.get(n-1);
		}else{
			fib2 = fib(n-1);
			fibMap.put(n-1, fib2);
		}
		
		return fib1+fib2;
	}
	

}
