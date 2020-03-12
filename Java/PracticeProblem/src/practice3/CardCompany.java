package practice3;

public class CardCompany {
	
	private static CardCompany cardinstance = new CardCompany();
	
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		if(cardinstance == null)
			cardinstance = new CardCompany();
		return cardinstance;
	}
	
	public Card createCard() {
		Card card = new Card();
		return card;
	}

	
	
	
	
}
