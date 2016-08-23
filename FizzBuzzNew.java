import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzzNew {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	       try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				int number = Integer.valueOf(br.readLine());

				for (int i = 1; i <= number; i++) {
					//This is what I did
					if (i % 3 == 0 && i % 5 == 0) {
						System.out.println("FizzBuzz");
					} else if (i % 3 != 0 && i % 5 != 0) {
						System.out.println(i);
					} else {
						if (i % 3 == 0) {
							System.out.println("Fizz");
						}
						if (i % 5 == 0) {
							System.out.println("Buzz");
						}
					}

					// This is what I should have done
					/*if (i % 3 != 0 && i % 5 != 0) {
						System.out.print(i);
					} else {
						if (i % 3 == 0) {
							System.out.print("Fizz");
						}
						if (i % 5 == 0) {
							System.out.print("Buzz");
						}
					}*/
					System.out.print("\n");
				}

			} catch (IOException io) {
				io.printStackTrace();
			}
	    }

}
