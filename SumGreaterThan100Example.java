package quizweek4;

public class SumGreaterThan100Example {
    public static void main(String[] args) {
        int[] numbers = {30, 40, 35};
        boolean result = isSumGreaterThan100(numbers);
        System.out.println(result);
    }
   
    public static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum > 100;
    }
}
