
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayGenerator generator = new ArrayGenerator();
        insetionSort(generator);
	}

	private static void insetionSort(ArrayGenerator generator) {
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
		
		for(int i = 0; i <= array.length - 1; i++){
			int insertValue = array[i];
			int insertionIndex = 0;
			for(int j = i; j >= 0; j--){
				if(j == 0){
					break;
				}
				else{
					if(array[j-1] > insertValue){
						array[j] = array[j - 1];
					}
					else{
						insertionIndex = j;
						break;
					}
				}
			}
			array[insertionIndex] = insertValue;
		}
		
		System.out.println("The sorted array based on insertion sort is: ");
		for(int i = 0; i <= array.length - 1; i++){
			System.out.print(array[i]+ " ");
		}	
	}

}
