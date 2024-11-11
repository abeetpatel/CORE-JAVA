package practiceThread;

public class ByThread extends Thread {
	
	public String name;
	
	public ByThread(String name) {
		this.name  = name;
		
	}
	
	@Override
	public void run() {
		
		for (int i = 1; i <= 5 ; i++) {
			
			System.out.println(i + " = " + name);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
