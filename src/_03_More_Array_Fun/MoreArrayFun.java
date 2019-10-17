package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] arf= {"Hello", "my name", "is jeff", "I am", "writing", "a message!"};	
		MoreArrayFun ugh=new MoreArrayFun(); 
		for (int i = 0; i < 10; i++) {
			ugh.cursedprinter(arf);
			System.out.println(" -next- ");
		}
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public void printer(String[]test) {

	for (int i = 0; i < test.length; i++) {
		System.out.println(test[i]);
	}
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public void shadowprinter(String[]test) {
	
		for (int i = test.length-1; i >0; i--) {
			System.out.println(test[i]);
		}
		}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public void spasmodicprinter(String[]test) {
		
		for (int i = 0; i < test.length; i+=2) {
			System.out.println(test[i]);
		}
		}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
public void cursedprinter(String[]test) {
		Random rando=new Random();
		int[] used=new int[test.length];
		for (int i = 0; i < used.length; i++) {
			used[i]=0;
		}
		int z;
	
		for (int i = 0; i < test.length; i++) {
			boolean success=false;
			z=rando.nextInt(test.length);
		if(used[z]==0) {
			System.out.println(test[z]);
		used[z]=1;
		}else {
			i--;
		}
		}
		}
	
	
}
