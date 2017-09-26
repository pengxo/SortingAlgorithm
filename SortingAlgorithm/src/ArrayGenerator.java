import java.util.Random;

public class ArrayGenerator {
	
	public int[] getArray(){
		int[] localArray = new int[50];
		Random random =new Random();
		for(int i = 0; i <= localArray.length - 1; i++){
			localArray[i] = random.nextInt()*20%99;
		}
		return localArray;
	}

}
