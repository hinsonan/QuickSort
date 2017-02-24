import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyQuickSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Ask the user for the size of the array they want

		System.out.print("Enter the size of the array you want: ");

		int size = scan.nextInt();


		
		
		//populate array list
		ArrayList array = createArrayList(size);
		
		//print out unsorted list
		System.out.println("Unsorted Array");
		for(Object n : array){
			System.out.print(n + " ");
		}

		System.out.println("");
		

		

		//HoarePartition(array , 0 , array.size() - 1);
		

		
		System.out.println("Partitioned Array");
		for(Object n: array ){
			System.out.print(n + " ");
		}
		
		quickSort(array, 0, array.size() - 1);
		
		System.out.println("Quicksorted Array");
		for(Object n: array ){
			System.out.print(n + " ");
		}
		
		


		

	}
	 private static void quickSort(ArrayList<Integer> arr, int lo, int hi)
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
	
	
	
	private static int HoarePartition(ArrayList<Integer> arr , int lo, int hi)
	{
		int p = arr.get(0);
		int i = lo;
		int j = hi +1;

		
		do
		{
			while((int)arr.get(i) <= p)
			{
				i = i + 1;
				
			}
			
			
			do
			{
				
				j = j - 1;
				
				
				
			}
			while((int)arr.get(j) >= p);
			//swap arr[i], arr[j]
			int temp = arr.get(i);
			arr.set(i, arr.get(j));
			arr.set(j, temp);
			
		}
		while(i <= j);
		//undo the last swap
		int temp = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, temp);
		
		//swap the partition value
		temp = arr.get(lo);
		arr.set(lo, arr.get(j));
		arr.set(j, temp);
		
		return j;
	

		
		
	}
	
	private static ArrayList createArrayList(int size){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//this loop will fill the array with values
		for(int i = 0; i < size; i++){
			//put random numbers into the array
			Random rand = new Random();
			//makes the random numbers 5 times the size of the array the user wants
			list.add(rand.nextInt((size*10)) + 1);
		}
		return list;
	}

}


