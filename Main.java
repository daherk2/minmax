import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		int[] vector = new int[]{2, 7, 8, 4, 11, 14, 20, 19, 18, 17};
		MinMax problema = new MinMax(vector);
		
		System.out.println(Arrays.toString(problema.calcularMinMax(problema.getVector(), 0, vector.length-1)));

	}
}