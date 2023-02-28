import java.util.Arrays;
import java.util.Collections;

public class RandomMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {12, 11, 5, 6, 18, 19, 1};
		insertSort(test);
		
		printArray(test);
		
	}
	
	
	// Alphabetically sort a string array
	public void alphabetSort(String [] arr) {
		Arrays.sort(arr);
	}
	
	public void reverseArray(int [] arr) {
		Collections.reverse(Arrays.asList(arr));
	}
	
	
	public static void insertSort(int [] arr) {
		int key;
		for(int i = 1; i < arr.length; ++i) {
			key = arr[i];
			int k = i -1;
			while(k >= 0 && arr[k] > key) {
				arr[k + 1] = arr[k];
				k = k -1;
			}
			arr[k + 1] = key;
		}
	}
	
	static void printArray(int arr[])
    {

            System.out.println(Arrays.toString(arr));
 
    }
	
	
 


}
