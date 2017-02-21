
import java.util.Random;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Ask the user for the size of the array they want
<<<<<<< HEAD
		System.out.print("Enter the size of the array you want: ");

		int size = scan.nextInt();

=======
		System.out.print("Enter the size of the array you want");
>>>>>>> parent of 6a23d49... implements quicksort but have out of bounds error
		size = scan.nextInt();
		
		int[] array = createIntArray(size);
		System.out.println("Unsorted Array");
		for(int n: array ){
			System.out.print(n + " ");
		}

		
		
<<<<<<< HEAD
		

		HoarePartition(array , 0 , array.length - 1);

		
=======
		HoarePartition(array);
>>>>>>> parent of 6a23d49... implements quicksort but have out of bounds error
		
		System.out.println("Partitioned Array");
		for(int n: array ){
			System.out.print(n + " ");
		}

<<<<<<< HEAD
		

	}
	
	private static int HoarePartition(int[] arr, int lo, int hi)
	{
		int p = arr[0];

		int i = lo - 1;
		int j = hi + 1;
=======
	}
	
	private static void HoarePartition(int[] arr)
	{
		int p = arr[0];
		int i = 0;
		int j = (size-1) + 1;
>>>>>>> parent of 6a23d49... implements quicksort but have out of bounds error
		
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

