package quizweek4;

public class codingassignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int[] nameLengths = new int[names.length];
		for (int i=0; i<names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		for (int length : nameLengths) {
			System.out.println(length);
			
		}
	}

}
