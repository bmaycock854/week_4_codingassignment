package quizweek4;

public class codingassignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int totalLetters = 0;
		for (String name : names) {
			totalLetters += name.length();
		}
		double averageLetters = (double) totalLetters / names.length;
		System.out.println(averageLetters);
		
		StringBuilder concantenatedNames = new StringBuilder();
		for (String name : names) {
			concantenatedNames.append(name).append(" ");
		}
		concantenatedNames.deleteCharAt(concantenatedNames.length()-1);
		System.out.println(concantenatedNames.toString());
	}

}
