class Card {

    String rank;
    String suit;
    
    
    Card(String r, String s) {
        this.rank = r;
        this.suit = s;
    }
    
  
	
	public enum Rank {
		
		ACE("A"),
		KING("K"),
		QUEEN("Q"),
		JACK("J"),
		TEN("T"),
		NINE("9"),
		EIGHT("8"),
		SEVEN("7"),
		SIX("6"),
		FIVE("5"),
		FOUR("4"),
		THREE("3"),
		DEUCE("2");

		String rank;
		Rank(String rank){
			this.rank = rank;
		}
		
	}

	public enum Suit {
		
		SPADES("s"),
		CLUBS("c"),
		HEARTS("h"),
		DIAMONDS("d");
		
		String suit;
		Suit(String suit){
			this.suit = suit;
		}
	}
	
	
}