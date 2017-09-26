
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayGenerator generator = new ArrayGenerator();
		bubbleSort(generator);
	}

	private static void bubbleSort(ArrayGenerator generator) {
		// TODO Auto-generated method stub
		int[] array = generator.getArray();
		long initialTime = System.currentTimeMillis();
		sortArray(array);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - initialTime;
		System.out.println("Execution time of bubble sort is: "+ executionTime);
		
	}

	private static void sortArray(int[] array) {
		// TODO Auto-generated method stub
		System.out.println("The original array is: ");
		for(int i = 0; i <= array.length - 1; i++){
			//System.out.print(array[i]+ " ");
		}		
		System.out.println();
		boolean swapped = false;
		for(int i = array.length - 1; i >= 0; i--){
			swapped = false;
			for(int j = 0; j <= i - 1; j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped){
				break;
			}
		}
		System.out.println("The sorted array based on bubble sort is: ");
		for(int i = 0; i <= array.length - 1; i++){
			//System.out.print(array[i]+ " ");
		}
	}

}
