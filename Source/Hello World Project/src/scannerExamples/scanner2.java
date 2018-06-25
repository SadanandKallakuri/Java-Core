package scannerExamples;

import java.util.Scanner;

public class scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int i;
		System.out.println("Enter num of billboards and intervals");

		Scanner s = new Scanner(System.in).useDelimiter("\\s");
		System.out.println(s.next());
		System.out.println(s.next());
		System.out.println("Enter rev of each billboard in new line");

		for (i = 0; i <= n; i++)
			System.out.println(s.nextLine());
		s.close();
	}

}
