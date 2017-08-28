package ko222gj_assign1;

import java.util.Arrays;
import java.util.Scanner;

public class PascalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a specific  row of Pascal´s triangle linje to be printed: ");
		int row = scanner.nextInt();
		int[] pascalRowN = pascal(row);
		System.out.println(Arrays.toString(pascalRowN));
		scanner.close();
	}
	
	
	private static int[] pascal(int row) {
		int[] array = new int[row];
		if( row == 1) {
			array[0] = 1;
			return array;
		}else {
			int[] temp = pascal(row - 1);
			array[0] = array[row -1] = 1;
			for(int i = 0; i < temp.length; i++) {
				if (i > 0){
					array[i] = temp[i-1] + temp[i];
				}
			}
			return array;
		}

	}

}
