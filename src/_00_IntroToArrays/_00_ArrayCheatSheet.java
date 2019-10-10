package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
 String[] collection =new String[5];
		//2. print the third element in the array
System.out.println(collection[3]);
		//3. set the third element to a different value
collection[3]="wheee!";
		//4. print the third element again
System.out.println(collection[3]);		
		//5. use a for loop to set all the elements in the array to a string of your choice
for (int i = 0; i < collection.length; i++) {
	collection[i]="Bandersnatch";
}		
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
for (int i = 0; i < collection.length; i++) {
	System.out.println(collection[i]);
}		
		//7. make an array of 50 integers
int[] numbers=new int[50];
		//8. use a for loop to make every value of the integer array a random number
Random rando=new Random();
for (int i = 0; i < numbers.length; i++) {
	numbers[i]=rando.nextInt();
}		

		//9. without printing the entire array, print only the smallest number on the array

		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
