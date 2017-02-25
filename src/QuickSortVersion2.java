import java.util.Random;
import java.util.Scanner;

public class QuickSortVersion2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Ask the user for the size of the array they want

		System.out.print("Enter the size of the array you want: ");

		int size = scan.nextInt();


		//create array and print it out
		//int[] array = {48, 95, 97, 61, 89, 7, 52, 26, 30, 81};
		//int[] array = createIntArray(size);
		int[] array = {51, 92, 54, 35, 27, 62, 73, 56, 76, 72};
		System.out.println("Unsorted Array");
		for(int n: array ){
			System.out.print(n + " ");
		}

		System.out.println("");
		

		

		//HoarePartition(array , 0 , array.length - 1);
		

		
		/*System.out.println("Partitioned Array");
		for(int n: array ){
			System.out.print(n + " ");
		}*/
		
		quickSort(array, 0, array.length - 1);
		
		System.out.println("Quicksorted Array");
		for(int n: array ){
			System.out.print(n + " ");
		}
		
		


		

	}
	 private static void quickSort(int[] arr, int lo, int hi)
	 {
		    /*Quicksort(A[l..r])
			Sorts a subarray by quicksort
			Input: Subarray of arrayA[0..n-1],defined by its left and right
			indiceslandr
			Output: SubarrayA[l..r] sorted in nondecreasing order
				if l<r 
		    		s = Partition(A[l..r])//sis a split position
		    		Quicksort(A[l..s-1])
		    		Quicksort(A[s+1..r])*/
		 
		 if(lo < hi)
		 {
			 int s = HoarePartition(arr, lo, hi);
			 quickSort(arr, lo, s - 1);
			 quickSort(arr, s + 1, hi);
			 
		 }
	 }
	
	
	
	private static int HoarePartition(int[] arr , int lo, int hi)
	{
		int p = arr[lo];
		int i = lo;
		int j = hi +1;

		
		do
		
		{
			
			while(arr[i] <= p) //if i is greater hi switch pivot and j
			{
				
				i = i + 1;
				
				
				
			}
			
			
			do
			{
				
				j = j - 1;
				
				
				
			}
			while(arr[j] > p);
			//swap arr[i], arr[j]
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
		
		while(i <= j);
		
		//undo the last swap
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		//swap the partition value
		temp = arr[lo];
		arr[lo] = arr[j];
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


