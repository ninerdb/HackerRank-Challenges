import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class KDiff {
	
	public static void kDifference(int A[], int k){
		if(A.length>1 && k >=1 && A.length == A.length){
            
            HashSet<Integer> hSet = new HashSet<Integer>();
             
            for(int i=0;i<A.length;i++){
                int inputElement = A[i];
                if(!hSet.contains(inputElement)){
                    hSet.add(inputElement);
                }
            }
         
            Iterator<Integer> itSet = hSet.iterator();
             
            while (itSet.hasNext()) {
                 
                Integer value = itSet.next();
                Integer subtractValue =  value+k;
                 
                if(hSet.contains(subtractValue)){
                    System.out.println("Pair Found:"+value+" & "+subtractValue);
                    pairCount++;
                }
            }
        }else{
            pairCount=0;
        }
         
        System.out.println("Total Pairs:"+pairCount);
*/
	}
	public static void main(String args[]){
		 
        /*int pairCount = 0;
        Integer elements[] = {1,3,4,5,8,8};
        int kDiff = 2;
        */
		
		
		System.out.println("Enter something here : ");
		   
		try{
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
        
         
                       
    }
}
