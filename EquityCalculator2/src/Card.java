class Card {

    Rank rank;
    Suit suit;

    
    
    Card(Rank r, Suit s) {
        this.rank = r;
        this.suit = s;
    }
    
  
	
	public enum Rank {
		
		ACE,
		KING,
		QUEEN,
		JACK,
		TEN,
		NINE,
		EIGHT,
		SEVEN,
		SIX,
		FIVE,
		FOUR,
		THREE,
		DEUCE;


		
	}

	public enum Suit {
		
		SPADES,
		CLUBS,
		HEARTS,
		DIAMONDS;
		

	}
	
	
}