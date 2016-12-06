import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Deck {
	static LinkedList<Card> deck = new LinkedList();
	static ArrayList<Card> board = new ArrayList();
	static ArrayList<Card> player1HoleCards = new ArrayList();
	
	/*
	Card[][] player1;
	Card[][] player2;
	Card[][] player3;
	*/
	
	static Card aceOfSpades = new Card("A", "s", 14);
	static Card deuceOfSpades = new Card("2", "s", 2);
	static Card threeOfSpades = new Card("3", "s", 3);
	static Card fourOfSpades = new Card("4", "s", 4);
	static Card fiveOfSpades = new Card("5", "s", 5);
	static Card sixOfSpades = new Card("6", "s", 6);
	static Card sevenOfSpades = new Card("7", "s", 7);
	static Card eightOfSpades = new Card("8", "s", 8);
	static Card nineOfSpades = new Card("9", "s", 9);
	static Card tenOfSpades = new Card("T", "s", 10);
	static Card jackOfSpades = new Card("J", "s", 11);
	static Card queenOfSpades = new Card("Q", "s", 12);
	static Card kingOfSpades = new Card("K", "s", 13);
	static Card aceOfClubs = new Card("A", "c", 14);
	static Card deuceOfClubs = new Card("2", "c", 2);
	static Card threeOfClubs = new Card("3", "c", 3);
	static Card fourOfClubs = new Card("4", "c", 4);
	static Card fiveOfClubs = new Card("5", "c", 5);
	static Card sixOfClubs = new Card("6", "c", 6);
	static Card sevenOfClubs = new Card("7", "c", 7);
	static Card eightOfClubs = new Card("8", "c", 8);
	static Card nineOfClubs = new Card("9", "c", 9);
	static Card tenOfClubs = new Card("T", "c", 10);
	static Card jackOfClubs = new Card("J", "c", 11);
	static Card queenOfClubs = new Card("Q", "c", 12);
	static Card kingOfClubs = new Card("K", "c", 13);
	static Card aceOfHearts = new Card("A", "h", 14);
	static Card deuceOfHearts = new Card("2", "h", 2);
	static Card threeOfHearts = new Card("3", "h", 3);
	static Card fourOfHearts = new Card("4", "h", 4);
	static Card fiveOfHearts = new Card("5", "h", 5);
	static Card sixOfHearts = new Card("6", "h", 6);
	static Card sevenOfHearts = new Card("7", "h", 7);
	static Card eightOfHearts = new Card("8", "h", 8);
	static Card nineOfHearts = new Card("9", "h", 9);
	static Card tenOfHearts = new Card("T", "h", 10);
	static Card jackOfHearts = new Card("J", "h", 11);
	static Card queenOfHearts = new Card("Q", "h", 12);
	static Card kingOfHearts = new Card("K", "h", 13);
	static Card aceOfDiamonds = new Card("A", "d", 14);
	static Card deuceOfDiamonds = new Card("2", "d", 2);
	static Card threeOfDiamonds = new Card("3", "d", 3);
	static Card fourOfDiamonds = new Card("4", "d", 4);
	static Card fiveOfDiamonds = new Card("5", "d", 5);
	static Card sixOfDiamonds = new Card("6", "d", 6);
	static Card sevenOfDiamonds = new Card("7", "d", 7);
	static Card eightOfDiamonds = new Card("8", "d", 8);
	static Card nineOfDiamonds = new Card("9", "d", 9);
	static Card tenOfDiamonds = new Card("T", "d", 10);
	static Card jackOfDiamonds = new Card("J", "d", 11);
	static Card queenOfDiamonds = new Card("Q", "d", 12);
	static Card kingOfDiamonds = new Card("K", "d", 13);

	public static void createDeck() {
		deck.add(aceOfSpades);
		deck.add(deuceOfSpades);
		deck.add(threeOfSpades);
		deck.add(fourOfSpades);
		deck.add(fiveOfSpades);
		deck.add(sixOfSpades);
		deck.add(sevenOfSpades);
		deck.add(eightOfSpades);
		deck.add(nineOfSpades);
		deck.add(tenOfSpades);
		deck.add(jackOfSpades);
		deck.add(queenOfSpades);
		deck.add(kingOfSpades);
		deck.add(aceOfClubs);
		deck.add(deuceOfClubs);
		deck.add(threeOfClubs);
		deck.add(fourOfClubs);
		deck.add(fiveOfClubs);
		deck.add(sixOfClubs);
		deck.add(sevenOfClubs);
		deck.add(eightOfClubs);
		deck.add(nineOfClubs);
		deck.add(tenOfClubs);
		deck.add(jackOfClubs);
		deck.add(queenOfClubs);
		deck.add(kingOfClubs);
		deck.add(aceOfHearts);
		deck.add(deuceOfHearts);
		deck.add(threeOfHearts);
		deck.add(fourOfHearts);
		deck.add(fiveOfHearts);
		deck.add(sixOfHearts);
		deck.add(sevenOfHearts);
		deck.add(eightOfHearts);
		deck.add(nineOfHearts);
		deck.add(tenOfHearts);
		deck.add(jackOfHearts);
		deck.add(queenOfHearts);
		deck.add(kingOfHearts);
		deck.add(aceOfDiamonds);
		deck.add(deuceOfDiamonds);
		deck.add(threeOfDiamonds);
		deck.add(fourOfDiamonds);
		deck.add(fiveOfDiamonds);
		deck.add(sixOfDiamonds);
		deck.add(sevenOfDiamonds);
		deck.add(eightOfDiamonds);
		deck.add(nineOfDiamonds);
		deck.add(tenOfDiamonds);
		deck.add(jackOfDiamonds);
		deck.add(queenOfDiamonds);
		deck.add(kingOfDiamonds);
	}
/*
	public static void dealPlayer1() {
		Deck.createDeck();
		int max = 51;
		int i = 2;
		while (i > 0) {
			int r = Deck.randomizeCard(0, max);
			Card holeCard = deck.get(r);
			player1HoleCards.add(holeCard);
			deck.remove(holeCard);
			--max;
			--i;
		}
		deck.removeAll(deck);
		System.out.println("Player hole cards: ");
		for (Card hc : player1HoleCards) {
			System.out.println(String.valueOf(hc.rank) + hc.suit);
		}
		player1HoleCards.removeAll(player1HoleCards);
	}
*/
/*
	public static void dealToRiver() {
		Deck.createDeck();
		int max = 51;
		int i = 5;
		while (i > 0) {
			int j = Deck.randomizeCard(0, max);
			Card communityCard = deck.get(j);
			board.add(communityCard);
			deck.remove(communityCard);
			--max;
			--i;
		}
		deck.removeAll(deck);
	}
*/
	
/*
	public static void dealBoard() {
		System.out.println("BOARD:");
		for (Card g : board) {
			System.out.println(String.valueOf(g.rank) + g.suit);
		}
	}
*/

/*
	public static void removeCards() {
		board.removeAll(board);
	}
*/

	private static int randomizeCard(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}
