
public class App {
	
	public static void main(String[] args) {
		
        long startTime = System.currentTimeMillis();
        Deck.createDeck();
        Dealer.createMonteCarlo();
        long endTime = System.currentTimeMillis();
        long timeNeeded = endTime - startTime;
        System.out.println("KONIEC: ");
        System.out.println("Czas trwania: " + timeNeeded + "ms");
        
	}
	
	

}
