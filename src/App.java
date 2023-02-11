import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		//System.out.println ("\nQuestion 1: Card Class");
		//Card card = new Card(" Two", "Hearts", 2);
		//card.describe();
		
		//System.out.println("");
		Deck deck = new Deck();
		//deck.describe();
		Player player1 = new Player("1");
	    Player player2 = new Player("2");
	     
		deck.shuffle();
		//deck.describe();
		for (int i = 0; i < 52; i++) {
            if ( i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }
		for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
            } else if (player1Card.getValue() < player2Card.getValue()) {
                player2.incrementScore();
            }
        }
		 System.out.printf("Player1 score = %d\n", player1.getScore());
	        System.out.printf("Player2 score = %d\n", player2.getScore());
	        if (player1.getScore() > player2.getScore()) {
	            System.out.println("Player1 is the winner!");
	        } else if (player1.getScore() < player2.getScore()) {
	            System.out.println("Player2 is the winner!");
	        } else {
	            System.out.println("It is a DRAW!");
	        }
	

		
		//Card drawnCard = deck.draw();
		//drawnCard.describe();
		
		
		//int numOfPlayers = 2;
		//Map<String, List<Card>> gameBoard = createGame(numOfPlayers);
	
		// Print out each Player and their Hand here.
		//System.out.println("--------------------------");
		//for (int i = 1; i <= numOfPlayers; i++) {
		//	String playerName = "Player " + i;
		//	System.out.println(playerName + "\n--------");
		//	List<Card> playerList = gameBoard.get(playerName);
		//	for (Card handCard : playerList) {
		//		handCard.describe();
			
			
	    //    System.out.printf("Player1 score = %d\n", player1.getScore());
	    //    System.out.printf("Player2 score = %d\n", player2.getScore());
	     //   if (player1.getScore() > player2.getScore()) {
	     //       System.out.println("Player1 is the winner!");
	     //   } else if (player1.getScore() < player2.getScore()) {
	      //      System.out.println("Player2 is the winner!");
	       // } else {
	       //     System.out.println("It is a DRAW!");
	      //  }

	}

}
