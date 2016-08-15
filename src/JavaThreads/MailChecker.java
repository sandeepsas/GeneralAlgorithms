package JavaThreads;
/*check mails in every 20 sec*/
public class MailChecker implements Runnable{

	public void run(){
		for(int i=0;i<=100;i++){
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("I checked my emails = "+i);
		}
	}

}
