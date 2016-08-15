package JavaThreads;

import java.text.DateFormat;
import java.util.*;

public class MyThread extends Thread{
	
	Date currentTime;
	Locale locale = new Locale("en");
	
	
	DateFormat sdf;
	
	public void run(){
		for (int i=0;i<=100;i++){
			currentTime = new Date();
			sdf = DateFormat.getTimeInstance(DateFormat.DEFAULT,locale);
			
			
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				
			}
			System.out.println(sdf.format(currentTime));
		}
	}
	

}
