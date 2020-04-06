package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class HeapSorting {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Vector<Integer> temp_arr = new Vector<Integer>();
		Vector<Integer> heap = new Vector<Integer>();
		Vector<Integer> sorted = new Vector<Integer>();
		//getting size
		System.out.println("Enter Size : ");
		int size = Integer.parseInt(br.readLine());
		//accepting data 
		for(int i = 0;i<size;i++) {
			System.out.println("Enter Data : ");
			temp_arr.add(i , Integer.parseInt(br.readLine()));
		}
		//initial values
		int rootIndex = 0;
		int value = 0;
		//sorting
		for(int i = 0; i < size; i++) {
			int tempSize = temp_arr.size(); // every time getting size of temp_arr
			for(int j = 0; j<tempSize;j++) {
				value = temp_arr.remove(0);//remove and assign to value variable
				heap.add(value);
				int index = j;//assign new index
				for(int k = 0; k < j; k++) {
					//calculate root index of index 
					if(index % 2 != 0)
						rootIndex = (index-1)/2;
					else
						rootIndex = (index - 2) / 2;
					//if value is greater than heap[index] then swap it 
					if(value > heap.elementAt(rootIndex)) {
						int temp = heap.set(index, heap.elementAt(rootIndex));
						heap.set(rootIndex, temp);
						index = rootIndex;
					}
				}
			}
			temp_arr = (Vector<Integer>) heap.clone();//copy heap array in temp arr
			heap.clear();//clear heap arr
			sorted.add(temp_arr.remove(0));//pop / remove first element
		}
		System.out.println(sorted.toString());//printing sorted arr
	}
}