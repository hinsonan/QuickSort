import java.util.Random;
import java.util.Scanner;

public class hw2_QuickSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Ask the user for the size of the array they want

		System.out.print("Enter the size of the array you want: ");

		int size = scan.nextInt();

		System.out.println("");
		System.out.println("");
		
		int[] array = createIntArray(size);
		
		System.out.println("Unsorted Array");
		for(int i = 0; i < array.length ; i++ ){
			if (i % 10 == 0 && i > 0)
			{
				System.out.println();
			}
			
			System.out.print(array[i] + " ");
		}

		System.out.println("");
		System.out.println("");
		

		

		
		
		quickSort(array, 0, array.length - 1);
		
		System.out.println("Quicksorted Array");
		for(int i = 0; i < array.length ; i++ ){
			if (i % 10 == 0 && i > 0)
			{
				System.out.println();
			}
			
			System.out.print(array[i] + " ");
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
			 quickSort(arr, lo, s );
			 quickSort(arr, s + 1 , hi);
			 
		 }
	 }
	
	

	
	public static int HoarePartition(int[] arr, int lo, int hi) {
		  //this other way took some research on manipulating loops but performs much better than my previous code
		  //part of the issues in the code I had was because of the do while loops
		  //with this approach we simplify the algorithm using incrementing arrays within a while loop which cuts down on the code you have to write
		
	      int p = arr[lo];
	      int i = lo - 1;
	      int j = hi + 1;
	      
	      /*So before I had a do while loop and that was causing some of the issues
	      I found out I could make a while loop that is always true
	      so this loop will always run until i >= j
	      the return statement takes you out of the while loop
	      */
	      while (true) {
	    	  
	    	 /* Now these while loops use postfix notation
	    	  * you have to use postfix or else you will get a array out of bounds exception
	    	  * every time these loops are false the variable will increase
	    	  * the loops will stop when a[i] >= pivot or a[j] <= pivot depending on which loop it is
	    	  */ 
	         while (arr[++i] < p); 
	         while (arr[--j] > p); 
	 
	         if (i >= j) {
	        	 //this breaks out of the while(true) loop
	            return j;
	         }
	         //swaps the values
	         int temp = arr[i];
		     arr[i] = arr[j];
		     arr[j] = temp;
	      }
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




