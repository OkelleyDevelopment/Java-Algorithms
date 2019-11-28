
/**
 * A simple implementation of the Bubble sort. 
 *
 * @author Nicholas O'Kelley
 *
 * @since 
 */

public class bubbleSort{
	
	public void bubbleSort(int arr[]){
		int n = arr.length;

		for(int i = 0; i < n-1; i++){
			for(int j = 0; j < n-i-1; j++){
				if(arr[j] > arr[j+1]){

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;
				}
			}
		}
	}


	/**
	 *
	 * Print out the array
	 * 
	 * @return none
	 */
	public void displayArray(int arr[]){
		
		int n = arr.length;

		for(int i = 0; i < n; ++i){
			System.out.println(arr[i] + "");
		}
		System.out.println();
	}


	public static void main(String args[]){
		
		bubbleSort sort = new bubbleSort();

		int arr[] = {12, 45, 21, 11, 90, 56, 73};
		
		System.out.println("Unsorted array contains: ");
		sort.displayArray(arr);
		System.out.println();

		sort.bubbleSort(arr);
		
		System.out.println("Sorted array: ");
		sort.displayArray(arr);
	}


}

