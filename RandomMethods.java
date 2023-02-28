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
	
	public void insert(int index, int integer) {
		if (index < 0 || index > size) {
			String message = "The index is outside the range [0, " + size 
					+ "].";
			throw new IndexOutOfBoundsException(message);
		}
		
		// If the array is full, double its capacity.
		if (size == array.length) {
			array = Arrays.copyOf(array, 2*array.length);
		}
		
		// Shift the integers at and above the given index to make room.
		for (int idx = size - 1; idx >= index; --idx) {
			array[idx + 1] = array[idx];
		}
		
		array[index] = integer;
		++size;
	}
	
 public int remove(int index) {
		if (index < 0 || index >= size) {
			String message = "The index is outside the range [0, "
					+ (size - 1) + "].";
			throw new IndexOutOfBoundsException(message);
		}
		
		// Save the integer to be returned in a temporary variable.
		int removedInt = array[index];
		
		// Shift the integers above the given index to fill the gap.
		for (int idx = index + 1; idx < size; ++idx) {
			array[idx - 1] = array[idx];
		}
		
		// Reduce the size. (Note: This variable determines the range of valid 
		// indices, so there is no need to overwrite any array elements.)
		--size;
		
		// If the array is 1/4 or less full and the length is greater than the 
		// minimum capacity, halve the capacity.
		if (4*size <= array.length && array.length > MIN_CAPACITY) {
			
			// Don't allow the capacity to drop below the minimum.
			int newCapacity = Math.max(array.length / 2, MIN_CAPACITY);
			array = Arrays.copyOf(array, newCapacity);
		}
		
		return removedInt;
	}
	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner(", ", "[", "]");
		// TODO: Complete this method.
		String temp = null;
		if(array != null && size > 0) {
			for(int i = 0; i < size; ++i) {
				temp = joiner.add(String.valueOf(array[i])).toString();
			}
			return temp;
		}
		return "[]";
		
	}


}
