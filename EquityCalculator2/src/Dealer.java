import java.util.ArrayList;

public class Dealer extends Deck {

	static int boardCounter = 1;
	static ArrayList<Card> boardMonteCarlo = new ArrayList();

	//// Metoda generuj¹ca wszystkie mo¿liwe kombinacje 5-kartowych uk³adów

	public static void dealMonteCarlo() {

		for (int flop1Counter = deck.size() - 1; flop1Counter >= 0; flop1Counter--) {
			boardMonteCarlo.add(deck.remove(flop1Counter));

			for (int flop2Counter = deck.size() - 1; flop2Counter >= 0; flop2Counter--) {
				boardMonteCarlo.add(deck.remove(flop2Counter));

				for (int flop3Counter = deck.size() - 1; flop3Counter >= 0; flop3Counter--) {
					boardMonteCarlo.add(deck.remove(flop3Counter));

					for (int turnCounter = deck.size() - 1; turnCounter >= 0; turnCounter--) {
						boardMonteCarlo.add(deck.remove(turnCounter));

						for (int riverCounter = deck.size() - 1; riverCounter >= 0; riverCounter--) {
							boardMonteCarlo.add(deck.remove(riverCounter));

							countBoards();
							//dealBoard();
							boardMonteCarlo.remove(4);

						}

						deck.clear();
						createDeck2();
						deck.remove(flop1Counter);
						deck.remove(flop2Counter);
						deck.remove(flop3Counter);
						boardMonteCarlo.remove(3);

					}
					deck.clear();
					createDeck2();
					deck.remove(flop1Counter);
					deck.remove(flop2Counter);
					boardMonteCarlo.remove(2);

				}
				deck.clear();
				createDeck2();
				deck.remove(flop1Counter);
				boardMonteCarlo.remove(1);

			}
			deck.clear();
			createDeck2();
			boardMonteCarlo.remove(0);

		}
		System.out.println("Liczba mozliwych ukladow: " + (boardCounter - 1));
	}

	public static void countBoards() {
		++boardCounter;
	}

	/// Metoda outputuj¹ca wygenerowane uk³ady kart

	public static void dealBoard() {

		Card flop1 = boardMonteCarlo.get(0);
		Card flop2 = boardMonteCarlo.get(1);
		Card flop3 = boardMonteCarlo.get(2);
		Card turn = boardMonteCarlo.get(3);
		Card river = boardMonteCarlo.get(4);

		System.out.println("Board nr " + boardCounter);
		//System.out.println(flop1.rank + flop1.suit + " " + flop2.rank + flop2.suit + " " + flop3.rank + flop3.suit + " "
				//+ turn.rank + turn.suit + " " + river.rank + river.suit);

	}

}
