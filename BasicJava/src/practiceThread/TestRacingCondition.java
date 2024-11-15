package practiceThread;

public class TestRacingCondition {
	
	public static void main(String[] args) {
		
		TestAccount t1 = new TestAccount("ram");
		
		TestAccount t2 = new TestAccount("shyam");
		
		t1.start();
		
		t2.start();
		
	}

}
