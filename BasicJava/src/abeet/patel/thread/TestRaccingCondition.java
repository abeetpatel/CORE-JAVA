package abeet.patel.thread;

public class TestRaccingCondition {
	
	public static void main(String[] args) {
		
		TestAccount t1 = new TestAccount("abeet");
		TestAccount t2 = new TestAccount("ram");
		
		t1.start();
		t2.start();
		
	}

}
