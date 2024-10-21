package abeet.patel.exeception;

public class Records {

	public static void main(String[] args) {
		
		String name = "yash";
		
		String name1 = "pooja";
		
		String name2 = "yash";
		
		String name3 = "amit";
	
	if(name == name1 || name == name2 || name == name3 || name2 == name3 || name1 == name3 || name1 == name2) {
		
		try {
			
			throw new DuplicaterecordException("There are duplicate Entities available..");
			
		}catch(DuplicaterecordException e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}else {
		
		System.out.println("Records are perfect..");
		
	}

	}
}
