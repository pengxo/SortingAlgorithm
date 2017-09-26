
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayGenerator generator = new ArrayGenerator();
        selectionSort(generator);

	}

	private static void selectionSort(ArrayGenerator generator) {
		// TODO Auto-generated method stub
		int[] array = generator.getArray();
		sortArray(array);
	}

	private static void sortArray(int[] array) {
		// TODO Auto-generated method stub
		System.out.println("The original array is: ");
		for(int i = 0; i <= array.length - 1; i++){
			System.out.print(array[i]+ " ");
		}	
		System.out.println();
		
		for(int i = 0; i < array.length; i++){
			int minIndex = i;
			for(int j = i; j < array.length; j++){
				if(array[j] < array[minIndex]){
					minIndex = j;
				}
			}
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
		
		System.out.println("The sorted array based on selection sort is: ");
		for(int i = 0; i <= array.length - 1; i++){
			System.out.print(array[i]+ " ");
		}	
	}

}
