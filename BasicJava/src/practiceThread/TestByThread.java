package practiceThread;

public class TestByThread {
	
	public static void main(String[] args) {
		
		ByThread t1 = new ByThread("ram");
		ByThread t2 = new ByThread("shyam");
		
		t1.setPriority(5);
		
		t1.start();
		t2.start();
		
	}

}
