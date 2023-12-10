package quizweek4;

public class Codingassignment6 {

	public static void main(String[] args) {
		String fullName = createFullName("John", "Doe");
        System.out.println(fullName);
    }

    public static String createFullName(String firstName, String lastName) {
        return new StringBuilder().append(firstName).append(" ").append(lastName).toString();
    }
}

   