import java.util.Scanner;

public class Staircase {
	
	public static void printStars(int amt){
		int n = 0;
		while(n < amt){
			System.out.println("*");
			n++;
		}
		System.out.println();
	}
	
	public static void printSpaces(int amt){
		int n = 0;
		while(n < amt){
			System.out.println(" ");
			n++;
		}
	}
	
	public static void printStairs(int a){
		
		for(int i = 0; i <= a; i++){
			printSpaces(a - i);
			printStars(i);
		}
	}
	
	public static void printStaircase(int a){
		StringBuilder sb = new StringBuilder();
		String[] star = new String[a];
		for(int i = a - 1; i >= 0; i++){
			for(int j = i ; j >= 0 ; j--){
				sb.append(" ");
				//a--;
				System.out.println(a);
				//sb.append("*");
				//System.out.println(sb);
			}
			sb.append("*");
			System.out.println(sb);
		}
	}	
	
	public static void main(String args[]){
		System.out.println("Enter the number of stairs: ");
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		Staircase st = new Staircase();
		st.printStaircase(a);
	}

}
