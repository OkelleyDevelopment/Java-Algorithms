
/**
 * Simple implementation of Insertion Sort
 *
 * @author Nicholas O'Kelley
 *
 */
public class InsertionSort{

	/**
	 * A method to use insertion sort, to sort an array. 
	 *
	 * @return none
	 *
	 */
	public void sort(int arr[]){
		System.out.println();
		int n = arr.length;
		
		for(int i = 1; i < n; ++i){
			System.out.println();
			displayArray(arr);
			
			int key = arr[i];
			int j = i - 1;

			while(j >= 0 && arr[j] > key){
				System.out.println();
				displayArray(arr);
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			System.out.println();
			displayArray(arr);
			arr[j + 1] = key;
		}
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
	 * This is the driver for the program.
	 *
	 */
	public static void main(String args[]){

		int arr[] = {15, 22, 4, 89, 6};

		System.out.println("\nThe array before Sorting: ");
		displayArray(arr);

		InsertionSort sort = new InsertionSort();
		sort.sort(arr);

		System.out.println("\nThe array after sorting: "); 
		displayArray(arr);
	}


}

