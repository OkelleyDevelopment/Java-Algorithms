
import java.util.Arrays;

/**
 * This is a recursive implementation of the
 * bubble sort algorithm.
 *
 *
 * @author Nicholas O'Kelley
 *
 */

public class RecursiveBubbleSort{

	public static void bubbleSort(int arr[], int n){

		//The base case
		if(n == 1){
			return;
		}

		/**
		 * One pass of bubble sort. After
		 * This pass, the largest element
		 * is moved to the end.
		 */
		for(int i=0; i < n-1; i++){
			if(arr[i] > arr[i+1]){

				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		// Largest element is fixed
		// recurse for remaining elements.
		bubbleSort(arr, n - 1);

	}


	/**
	 * This is a helper method, called to display the array.
	 *
	 * @return none
	 */
	public static void displayArray(int arr[]){

		int n = arr.length;
		for(int i = 0; i < n; ++i){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


	/**
	 * This is the main method for this simple program.
	 *
	 */
	public static void main(String[] args){

		int arr[] = { 34, 23, 76, 1, 5, 4, 69};
		System.out.println("The unsorted array: ");
		System.out.println(Arrays.toString(arr));

		bubbleSort(arr, arr.length);

		System.out.println("The Sorted Array: ");
		System.out.println(Arrays.toString(arr));
	}


		

}

