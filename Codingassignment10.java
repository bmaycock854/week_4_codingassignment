package quizweek4;

public class Codingassignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isHotOutside = true;
        double moneyInPocket = 15.75;

        boolean result = willBuyDrink(isHotOutside, moneyInPocket);
        System.out.println(result);  
    }
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
	}

}
