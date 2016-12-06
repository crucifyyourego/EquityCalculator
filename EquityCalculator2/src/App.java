
public class App {
	
	public static void main(String[] args) {
		
        long startTime = System.currentTimeMillis();
        Deck.createDeck();
        Dealer.dealMonteCarlo();
        long endTime = System.currentTimeMillis();
        long timeNeeded = endTime - startTime;
        System.out.println("Czas trwania appki: " + timeNeeded + "ms");
        
	}
	
	

}
