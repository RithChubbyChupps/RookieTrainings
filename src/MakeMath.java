
public class MakeMath {
	public static void main(String []args) {
		// create an array with 4 indexes
		int [] rithvikArray = new int [4];
		rithvikArray [3] = 10;
		for (int i = 0; i<rithvikArray.length; i++) {
			rithvikArray [i] = i;
			System.out.println (rithvikArray[i]);
		}
		// create a for loop that while i is less than the 
		// yourArray.length, then it will set the element to i at 
		// the index of yourArray that is equal to i
		// During this, print your array
		
		System.out.println("onto next");
		
		
		// for each in yourArray, add 1
		// During this, print yourArray
		for (int i = 0; i<rithvikArray.length; i++) {
			rithvikArray [i] = i+1;
			System.out.println (rithvikArray[i]);
		}
		
		System.out.println("onto next");
		
		// create an integer x with value 0
		// while x is less than yourArray, add one to x
		// during this, print x
		int x = 0;
		while (x < rithvikArray.length)
		{
			System.out.println (x);
			x++;
			
		}
		System.out.println("onto next");
		
		
		// for each element in yourArray
		// if each is less than 0 print blah
		// else if each is less than 1 print bleh
		// else if each is less than 2 print blooh
		// else print raaaaawr
		for (int a = 0; a < rithvikArray.length; a++){
			rithvikArray [a] = a;
			if (rithvikArray [a] < 0){
				System.out.println("blah");
			}
			else if (rithvikArray [a] < 1){
				System.out.println("bleh");
			}
			else if (rithvikArray [a] < 2){
				System.out.println("blooh");
			}
			else {
				System.out.println("raaaaawr");
			}
		}
			
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
