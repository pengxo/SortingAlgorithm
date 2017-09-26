
public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayGenerator generator = new ArrayGenerator();
        shellSort(generator);

	}

	private static void shellSort(ArrayGenerator generator) {
		// TODO Auto-generated method stub
		int[] array = generator.getArray();
		System.out.println("The original array is: ");
		for(int i = 0; i <= array.length - 1; i++){
			System.out.print(array[i]+ " ");
		}	
		System.out.println();
		sortArray(array);
		System.out.println("The sorted array based on shell sort is: ");
		for(int i = 0; i <= array.length - 1; i++)
			System.out.print(array[i]+ " ");
	}

	private static void sortArray(int[] array) {
		// TODO Auto-generated method stub
	    int interval = 1;
	    while(interval <= (array.length - 1)/3){
	    	interval = 3*interval +1;
	    }
	    
	    while(interval > 0){
	    	//for(int i = 0; i < array.length; i++){		    	
		    	for(int i = 0; i < array.length; i+=interval){
		    		int insertValue = array[i];
		    		int insertPosition = i;
		    		int j = i;
		    		while(j >= interval){
		    			if(array[j - interval] > insertValue){
			    			array[j] = array[j - interval];
			    			j = j - interval;
			    			insertPosition = j;
			    		}
		    			else{
		    				break;
		    			}
		    		}
		    	    array[insertPosition] = insertValue;
		    	}
	    	//}
	    	interval = (interval - 1)/3;
	    }
	}

}
