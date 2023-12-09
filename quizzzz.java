package quizweek4;

import java.util.HashMap;
import java.util.Map;

public class quizzzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int result = ages[ages.length-1]-ages[0];
		System.out.println(result);
		
		int[] ages2 = new int[9];
		int result2 = ages2[ages2.length-1]-ages2[0];
		System.out.println(result2);
		
		int sum = 0;
		for (int i=0; i<ages.length; i++) {
			sum+=ages[i];
		}
		
		double average = (double) sum/ages.length;
		System.out.println(average);
		
	}
}
