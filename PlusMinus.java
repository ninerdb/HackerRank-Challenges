import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {

	public void plusMinus(double a, List<Integer> b) {
		double posSize = 0, negSize = 0, zeroSize = 0;
		for (int i = 0; i < b.size(); i++) {
			if (b.get(i) > 0) {
				posSize++;
			} else if (b.get(i) < 0) {
				negSize++;
			} else {
				zeroSize++;
			}
		}

		DecimalFormat numberFormat = new DecimalFormat("#.000000");
		double posNum = posSize / a;
		System.out.println(numberFormat.format(posNum));
		double negNum = negSize / a;
		System.out.println(numberFormat.format(negNum));
		double zeroNum = zeroSize / a;
		System.out.println(numberFormat.format(zeroNum));

	}

	public static void main(String args[]) {
		System.out.println("Enter array size: ");
		Scanner sc = new Scanner(System.in);
		double a = Integer.parseInt(sc.nextLine());
		List<Integer> list = new ArrayList<Integer>();
		String[] b = sc.nextLine().split(" ");
		for (int i = 0; i < a; i++) {
			list.add(Integer.parseInt(b[i]));
		}
		System.out.println(list);
		PlusMinus pm = new PlusMinus();
		pm.plusMinus(a, list);
	}

}
