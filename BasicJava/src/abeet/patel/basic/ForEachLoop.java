package abeet.patel.basic;

public class ForEachLoop {
	public static void main(String[] args) {

		int[] i = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(i[4] + "  " + i[3]);

		for (int a : i) {
			System.out.println(a);
		}
	}

}
