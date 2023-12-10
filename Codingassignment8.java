package quizweek4;

public class Codingassignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] nums = {10.5, 15.2, 20.8};
		double average = calculateAverage(nums);
		System.out.println(average);
	}

	private static double calculateAverage(double[] array) {
		// TODO Auto-generated method stub
	
	double sum = 0;
	
	for (double nums : array) {
		sum += nums;
	}
			return sum / array.length;

}
}