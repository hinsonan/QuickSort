
import java.util.Random;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Ask the user for the size of the array they want

		System.out.print("Enter the size of the array you want: ");

		int size = scan.nextInt();


		
		int[] array = createIntArray(size);
		System.out.println("Unsorted Array");
		for(int n: array ){
			System.out.print(n + " ");
		}

		System.out.println("");
		

		

		HoarePartition(array , 0 , array.length - 1);

		

		

		
		System.out.println("Partitioned Array");
		for(int n: array ){
			System.out.print(n + " ");
		}


		

	}
	
	
	
	private static int HoarePartition(int[] arr , int lo, int hi)
	{
		int p = arr[0];
		int i = lo;
		int j = hi +1;

		
		do
		{
			while(arr[i] <= p)
			{
				i = i + 1;
			}
			
			
			do
			{
				j = j - 1;
			}
			while(arr[j] >= p);
			//swap arr[i], arr[j]
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
		while(!(i >= j));
		//undo the last swap
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		//swap the partition value
		temp = arr[0];
		arr[0] = arr[j];
		arr[j] = temp;
		
		return j;
	

		
		
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

