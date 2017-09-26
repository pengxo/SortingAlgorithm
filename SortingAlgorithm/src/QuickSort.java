
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     ArrayGenerator generator = new ArrayGenerator();
	     quickSort(generator);
	}

	private static void quickSort(ArrayGenerator generator) {
		// TODO Auto-generated method stub
		int[] array = generator.getArray();
		for(int i = 0; i <= array.length - 1; i++){
			System.out.print(array[i]+ " ");
		}	
		System.out.println();
		
		sortArray(array);
		
		System.out.println("The sorted array based on quick sort is: ");
		for(int i = 0; i <= array.length - 1; i++)
			System.out.print(array[i]+ " ");
	}

	private static void sortArray(int[] array) {
		// TODO Auto-generated method stub
		int left = 0;
		int right = array.length - 1;
		int pivot = array[array.length - 1];
		partitionArray(left, right, pivot, array);
	}

	private static void partitionArray(int left, int right, int pivot, int[] array) {
		// TODO Auto-generated method stub
		if(left >= right)
			return;
		int localLeft = left;
		int localRight = right;
		while (true){
			while(left < right && array[left] <= pivot){
				left++;
			}
			while(left < right && array[right] >= pivot){
				right--;
			}
			if(left < right){
				swap(left, right, array);
			}
			else{
				break;
			}
		}
		if(array[left] > pivot){
			swap(left, localRight, array);
		}
		if(left > 0){
			int leftPivot = array[left - 1];
			partitionArray(localLeft, left - 1, leftPivot, array);
		}
		
		int rightPivot = array[localRight];
		partitionArray(left +1, localRight, rightPivot, array);
	}

	private static void swap(int left, int right, int[] array) {
		// TODO Auto-generated method stub
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

}
