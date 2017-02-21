import java.util.Random;
import java.util.Scanner;

public class QuickSort {
	
	private static int size;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Ask the user for the size of the array they want
		System.out.print("Enter the size of the array you want: ");
		size = scan.nextInt();
		
		
		
		int[] array = createIntArray(size);
		System.out.println("Unsorted Array");
		for(int n: array ){
			System.out.print(n + " ");
		}
		
		System.out.println("");
		
		quickSort(array, 0, array.length-1);
		
		System.out.println("Partitioned Array");
		for(int n: array ){
			System.out.print(n + " ");
		}
		

	}
	
	private static void quickSort(int[] arr, int lo, int hi)
	{
		
		
		if(lo < hi)
		{
			int pivot = HoarePartition(arr, 0, arr.length - 1);
			quickSort(arr, lo, pivot);
			quickSort(arr, pivot + 1 , hi);
			
			
			
		}
	}
	
	private static int HoarePartition(int[] arr, int lo, int hi)
	{
		int p = arr[lo];
		int i = lo;
		int j = hi - 1;
		
		while(i >= j);
		{
			while(arr[i] <= p)
			{
				i = i + 1;
			}
			
			
			while(arr[j] >= p);
			{
				j = j - 1;
			}
			
			//swap arr[i], arr[j]
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
	
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
