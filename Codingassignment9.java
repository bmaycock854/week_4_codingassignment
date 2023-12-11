package quizweek4;

public class Codingassignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array1 = {20.3, 48.7, 65.1};
		double[] array2 = {125.8, 2.2, 6.8};
		
		boolean result = compareAverages(array1, array2);
		System.out.println(result);
	}
	public static boolean compareAverages(double[] array1, double[] array2) {
        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);

        return average1 > average2;
    }
	public static double calculateAverage(double[] array) {
        if (array.length == 0) {
        }

        double sum = 0;
        for (double value : array) {
            sum += value;
        }

        return sum / array.length;
    }
	

}
