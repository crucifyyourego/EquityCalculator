import java.util.ArrayList;

public class Dealer {
	
	static int boardCounter = 1;
	 static ArrayList<Card> boardMonteCarlo = new ArrayList();

	    public static void createMonteCarlo() {
	    	
	    	

	        for (int flop1Counter = Deck.deck.size() - 1; flop1Counter >= 0; flop1Counter--) {
	            int flop1Remove = 0;
	            int flop2Remove = 0;
	            int flop3Remove = 0;
	            int turnRemove = 0;
	            flop1Remove = flop1Counter;
	            boardMonteCarlo.add(Deck.deck.get(flop1Counter));
	            Deck.deck.remove(flop1Counter);
	            
	            for (int flop2Counter = Deck.deck.size() - 1; flop2Counter >=0; flop2Counter--) {
	                flop2Remove = flop2Counter;
	                boardMonteCarlo.add(Deck.deck.get(flop2Counter));
	                Deck.deck.remove(flop2Counter); 

	                
		            for (int flop3Counter = Deck.deck.size() - 1; flop3Counter >=0; flop3Counter--) {
	                    flop3Remove = flop3Counter;
	                    boardMonteCarlo.add(Deck.deck.get(flop3Counter));
	                    Deck.deck.remove(flop3Counter);

	                    
	    	            for (int turnCounter = Deck.deck.size() - 1; turnCounter >=0; turnCounter--) {
	                        turnRemove = turnCounter;
	                        boardMonteCarlo.add(Deck.deck.get(turnCounter));
	                        Deck.deck.remove(turnCounter);

	                        
	        	            for (int riverCounter = Deck.deck.size() - 1; riverCounter >=0; riverCounter--) {
	                            boardMonteCarlo.add(Deck.deck.get(riverCounter));
	                            Deck.deck.remove(riverCounter);
	                            countBoards();
	                            dealBoard();
	                            boardMonteCarlo.remove(4);

	                        }
	                        
	                        Deck.deck.removeAll(Deck.deck);
	                        Deck.createDeck();
	                        Deck.deck.remove(flop1Remove);
	                        Deck.deck.remove(flop2Remove);
	                        Deck.deck.remove(flop3Remove);
	                        boardMonteCarlo.remove(3);

	                    }
	                    Deck.deck.removeAll(Deck.deck);
	                    Deck.createDeck();
	                    Deck.deck.remove(flop1Remove);
	                    Deck.deck.remove(flop2Remove);
	                    boardMonteCarlo.remove(2);

	                }
	                Deck.deck.removeAll(Deck.deck);
	                Deck.createDeck();
	                Deck.deck.remove(flop1Remove);
	                boardMonteCarlo.remove(1);

	            }
	            Deck.deck.removeAll(Deck.deck);
	            Deck.createDeck();
	            boardMonteCarlo.remove(0);

	        }
	        System.out.println("Liczba mozliwych ukladow: " + (boardCounter - 1));
	    }

	    public static void countBoards() {
	        ++boardCounter;
	    }
	    
	    public static void dealBoard() {
	    	
	    	Card flop1 = boardMonteCarlo.get(0);
	    	Card flop2 = boardMonteCarlo.get(1);
	    	Card flop3 = boardMonteCarlo.get(2);
	    	Card turn = boardMonteCarlo.get(3);
	    	Card river = boardMonteCarlo.get(4);
	    	
	    	System.out.println("Board nr " + boardCounter);
	    	System.out.println(flop1.rank+flop1.suit + " " + flop2.rank+flop2.suit + " " + flop3.rank+flop3.suit + " " + turn.rank+turn.suit + " " + river.rank+river.suit);
	    	
	    	
	    }
	    
}
