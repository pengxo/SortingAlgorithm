
public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     ArrayGenerator generator = new ArrayGenerator();
	     heapSort(generator);
	}

	private static void heapSort(ArrayGenerator generator) {
		// TODO Auto-generated method stub
		int[] array = generator.getArray();
		for(int i = 0; i <= array.length - 1; i++){
			System.out.print(array[i]+ " ");
		}	
		System.out.println();
		
		sortArray(array);
		
		System.out.println("The sorted array based on heap sort is: ");
		for(int i = 0; i <= array.length - 1; i++)
			System.out.print(array[i]+ " ");
	}

	private static void sortArray(int[] array) {
		// TODO Auto-generated method stub
		for(int i = array.length; i > 0; i--){
			buildHeap(i, array);
			swap(0, i-1, array);
		}
	}

	private static void buildHeap(int length, int[] array) {
		// TODO Auto-generated method stub
		for(int i = length/2 - 1; i >= 0; i--){
			satisfyHeap(i, length, array);
		}
	}

	private static void satisfyHeap(int i, int length, int[] array) {
		// TODO Auto-generated method stub
		int leftChild = 2*i + 1;
		int rightChild = 2*i + 2;
		if(leftChild < length && array[leftChild] > array[i]){
			swap(leftChild, i, array);
		}
		if(rightChild < length && array[rightChild] > array[i]){
			swap(rightChild, i, array);
		}
	}

	private static void swap(int leftChild, int i, int[] array) {
		// TODO Auto-generated method stub
		int temp = array[leftChild];
		array[leftChild] = array[i];
		array[i] = temp;
	}

}
