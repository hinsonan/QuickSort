import java.util.Random;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Ask the user for the size of the array they want
		System.out.print("Enter the size of the array you want");
		int size = scan.nextInt();
		
		int[] unSortedArray = createIntArray(size);
		
		HoarePartition(unSortedArray);
		

	}
	
	private static void HoarePartition(int[] arr)
	{
		int p = arr[0];
		
		
	}
	
	private static int[] createIntArray(int size){
		int[] array = new int[size];
		
		//this loop will fill the array with values
		for(int i = 0; i < array.length; i++){
			//put random numbers into the array
			Random rand = new Random();
			//makes the random numbers 5 times the size of the array the user wants
			array[i] = rand.nextInt((size*10)) + 1;
		}
		return array;
	}

}
