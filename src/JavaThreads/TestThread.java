package JavaThreads;

public class TestThread {

	public static void main(String[] args) {
		
		Thread my = new MyThread();
		my.start();
		
		Runnable mc =new MailChecker();
		mc.run();

	}

}
