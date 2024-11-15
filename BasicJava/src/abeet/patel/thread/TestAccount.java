package abeet.patel.thread;

public class TestAccount extends Thread {
	
	public static Account a = new Account();
	
	public String name;
	
	public TestAccount(String name) {
		
		this.name = name;
		
		
	}
	
	@Override
	public void run() {
		
		for (int i = 1; i <= 5 ; i++) {
			
			a.deposit(name ,1000);
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
