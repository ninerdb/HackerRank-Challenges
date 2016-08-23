import java.io.*;
import java.util.*;

public class SimpleArraySum {

	public int SumArray(List<Integer> b) {
		int sum = 0;
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
		List<Integer> elementList = new ArrayList<Integer>();
		String[] b = sc.nextLine().split("\\s");

		for (int i = 0; i < b.length; i++) {
			elementList.add(Integer.parseInt(b[i]));
		}
		SimpleArraySum sas = new SimpleArraySum();
		sas.SumArray(elementList);

	}

}
