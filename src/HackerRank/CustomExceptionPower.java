package HackerRank;

import java.util.Scanner;

class CustomExceptionPower {

	public static void main(String[] args) {

		int n = 10;
		int p = 2;
		MyCalculator my_calculator = new MyCalculator();
		try {
			System.out.println(my_calculator.power(n, p));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
class MyCalculator{
	public int power(int n, int p) throws Exception{
		int k =1;
		if(n < 0 || p < 0){
			throw new Exception("n and p should be non-negative"); 
		}else{
			for(int i=0;i<p;i++){
				k=k*n;
			}
		}
		return k;
	}
}