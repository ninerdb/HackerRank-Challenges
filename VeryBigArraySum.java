import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VeryBigArraySum {
	public long SumArray(List<Integer> b) {
		long sum = 0;
		for (int i = 0; i < b.size(); i++) {
			sum += b.get(i);
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {	
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		if (Integer.parseInt(a) >= 1 && Integer.parseInt(a) <= 10) {
			List<Integer> elementList = new ArrayList<Integer>();
			String[] b = sc.nextLine().split("\\s");

			for (int i = 0; i < b.length; i++) {
				elementList.add((int) Long.parseLong(b[i]));
			}
			VeryBigArraySum sas = new VeryBigArraySum();
			sas.SumArray(elementList);

		} else {
			System.out.println("Please enter an array size between 1 and 10");
		}

	}

}
