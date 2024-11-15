package practiceThread;

public class TestAccount extends Thread {
	
	public String name;
	
	public TestAccount(String name) {
		
		this.name = name;
		
	}
	
	public static Account a = new Account();
	
	@Override
	public void run() {
		
		for (int i = 1; i <= 5; i++) {
			
			a.deposite(name, 1000);
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
