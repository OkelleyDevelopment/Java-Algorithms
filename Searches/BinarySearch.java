/**
 * Simple iterative implmentation of a binary search,
 *
 * @author Nicholas O'Kelley
 *
 * @since November 29, 2019
 */
public class BinarySearch { 

	public int BinarySearch(int array[], int size, int searchVal){

		int low = 0;
		int high = size -1;

		int middle;

		while(low <= high){

			middle = (low + high) /2;

			if(searchVal == array[middle]){
				return middle;
			}

			else if( searchVal > array[middle]){

				low = middle + 1;
			}

			else{
				high = middle - 1;
			}

		}
		return -1;
	}


	public static void main(String[] args){

		BinarySearch  bSearch = new BinarySearch();

		// The array MUST be sorted.
		int[] arr = {0, 3,6,  7, 8, 27, 43, 461};

		int length = arr.length;
		int valueToFind = 27;
		
		System.out.println("\nWelcome to the BinarySearch Module");
		
		System.out.println("\nThe array contains: ");
		
		for(int element : arr){
			System.out.print(element + ",");
		}

		System.out.println("\n\nThe value to find: " + valueToFind + "\n\nRunning the search...\n");


		int result = bSearch.BinarySearch(arr, length, valueToFind);
	
		if(result == -1){
			System.out.println("Element is not present in the array.");
		}
		else{
			System.out.println("Element found at index " + result);
		}
	}
}

