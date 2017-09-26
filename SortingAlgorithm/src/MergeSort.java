
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayGenerator generator = new ArrayGenerator();
        mergeSort(generator);

	}

	private static void mergeSort(ArrayGenerator generator) {
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
		
		divideArray(0, array.length - 1, array);
		System.out.println("The sorted array based on merge sort is: ");
		for(int i = 0; i <= array.length - 1; i++){
			System.out.print(array[i]+ " ");
		}	
	}

	private static void divideArray(int low, int high, int[] array) {
		// TODO Auto-generated method stub
		if(high <= low)
			return;
		else{
			int mid = (low + high)/2;
			divideArray(low, mid, array);
			divideArray(mid+1, high, array);
			mergeArray(low, mid, high, array);
		}
	}

	private static void mergeArray(int low, int mid, int high, int[] array) {
		// TODO Auto-generated method stub
		int[] localArray = new int[array.length];
		int i, j, k;
		for(i = low, j = mid + 1, k = low; i <= mid && j <= high; k++){
			if(array[i] > array[j]){
				localArray[k] = array[j];
				j++;
			}
			else{
				localArray[k] = array[i]; 
				i++;
			}
		}
		
		while(i <= mid){
			localArray[k++] = array[i];
			i++;
			
		}
		
		while(j <= high){
			localArray[k++] = array[j];
			j++;
		}
		
		for(int m = low; m <= high; m++){
			array[m] = localArray[m];
		}	
	}

}
