import java.util.Scanner;

public class DiagonalDifference {
	
	public static void main(String args[]){
		System.out.println("Enter the matrix size: ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		Integer size = Integer.parseInt(a);
		//System.out.println("Enter the matrix: ");
		//String[][] diagnol = new String[sc.nextInt()][sc.nextInt()];
		int sum1, sum2 = 0;
		for(sum1 = 0, sum2 = size -1; sum1 < size ; sum1++, sum2--){
			String[] inputLine = sc.nextLine().split(" ");
			sum1 += Integer.parseInt(inputLine[sum1]);
			sum2 += Integer.parseInt(inputLine[sum2]);
			//System.out.println("Sum1 " +sum1);
			//System.out.println("Sum2 " +sum2);
		}
		System.out.println(" sum = " +Math.abs(sum1 - sum2));
		
		
	}
	
}
