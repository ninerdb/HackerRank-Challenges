import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SavePrisoner {
	
	public long findPoisonSweet(int a, List<List<Integer>> b){
		/*long numOfPrisoners = b.get(0);
		long numofSweets = b.get(1);
		long idNum = b.get(2);*/
		
		int size = b.size();
		for(int i = 0; i <= size; i++ ){
			//long numOfPrisoners = b.;
			//long numofSweets = b.get(1);
			//long idNum = b.get(2);
		}
		
		
		
		return 0;
		
	}
	
	public static void main(String args[]){
		
		System.out.println("Enter the number of test cases: ");
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> list1 = new ArrayList<>();

		String[] b = sc.nextLine().split(" ");
		for (int i = 0; i <= tc; i++) {
			list.add(Integer.parseInt(b[i]));
			
		}
		list1.add(list);
		/*while(sc.hasNext()){
			list.add(sc.nextInt());
		}*/
		//sc.close();
		System.out.println(list);
		System.out.println(list1);
		SavePrisoner sp = new SavePrisoner();
		sp.findPoisonSweet(tc, list1);
	}

}
