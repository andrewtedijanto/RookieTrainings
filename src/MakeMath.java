
public class MakeMath {
	public static void main(String []args) {
		int[] yourArray = new int[4]; 			// create an array with 4 indexes
		
		for (int i = 0; i < yourArray.length; i++){// create a for loop that while i is less than the 
			yourArray[i] = i;
			System.out.println (yourArray[i]);	// yourArray.length, then it will set the element to i at 
		}										// the index of yourArray that is equal to i
												// During this, print your array
		
		System.out.println("onto next");
		
		for (int e = 0; e < yourArray.length; e++){						// for each in yourArray, add 1
			yourArray[e] = e + 1;
			System.out.println(yourArray[e]); // During this, print yourArray
		}
		
		System.out.println("onto next");
												// create an integer x with value 0
		for (int x = 0; x < yourArray.length;) {					// while x is less than yourArray, add one to x
			System.out.println(x); 				// during this, print x
			x++;
		}
		
		System.out.println("onto next");
		
		for (int each = -1; each < yourArray.length; each++) {
			if (each < 0)
				System.out.println("blah");
			else if (each < 1)
				System.out.println("bleh");
			else if (each < 2)
				System.out.println("blooh");
			else
				System.out.println("raaaaawr");
		}
	// for each element in yourArray
		// if each is less than 0 print blah
		// else if each is less than 1 print bleh
		// else if each is less than 2 print blooh
		// else print raaaaawr

		System.out.println("Done!");
		
		// after running, it should look something like:
		// 0
		// 1
		// 2
		// 3
		// onto next
		// 1
		// 2
		// 3
		// 4
		// onto next
		// 0
		// 1
		// 2
		// 3
		// onto next
		// bleh
		// blooh
		// raaaaawr
		// raaaaawr
		// Done!
	}
}
