package HackerRank;

import java.util.Scanner;

public class UseStaticForInitialization {
	
	static int B,H;
	static boolean flag=false;
	static{
	    
	    Scanner s=new Scanner(System.in);
	    B=s.nextInt();
	    H=s.nextInt();
	    
	    if(B>0&&H>0)
	        flag=true;
	    else
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	}

	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}

/*public static int H;
public static int B;
public static boolean flag = initializeFlag();

private static boolean initializeFlag(){
    Scanner sc = new Scanner(System.in);
    H = sc.nextInt();
    B = sc.nextInt();
    if(H>0 && B>0){
        return true;
    }else{
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        return false;
    }
}*/