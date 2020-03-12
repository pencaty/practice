package practice3;

public class Card {
	
	private static int cardNumber = 1000;
	private int number;
	
	public Card() {
		this.number = cardNumber;
		cardNumber++;
	}

	public int getCardNumber() {
		return this.number;
	}


}
