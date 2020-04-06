package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShellSorting {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//initialize the variables
		int[] _array = null;
		int size = 0;
		//Take size from user
		System.out.println("Enter Size of an array : ");
		size = Integer.parseInt(br.readLine());
		_array = new int[size];
		//Take elements of array from user
		for(int i = 0;i<size;i++) {
			System.out.println("Enter the element of an array : ");
			_array[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Before sorting array may be : ");
		for (int i : _array) {
			System.out.print(" "+i);
		}
		//Shell sorting 
		for(int gap = size/2; gap > 0; gap--) {
			for(int i = 0 , j = i + gap;j < size; i++,j++) {
				if(_array[i] > _array[j]) {
					int temp = _array[i];
					_array[i] = _array[j];
					_array[j] = temp;
				}
			}
		}
		
		System.out.println("\nAfter sorting array may be : ");
		for (int i : _array) {
			System.out.print(" "+i);
		}
	}

}
