package quizweek4;

public class Codingassignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = concatenateWordNTimes(word , n);
        System.out.println(result);  
    }
    public static String concatenateWordNTimes(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
	}

}
