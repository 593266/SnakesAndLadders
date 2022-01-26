package textInterface;

import java.util.List;

import entity.Dice;
import entity.Piece;

public class TextPrinter {

	
	public void Welcome() {
		System.out.println("Velkommen til Stigespillet "
				+ "\nFor å starte må spillere ha navn."
				+ "\nSkriv inn navn på spiller og trykk enter."
				+ "\nSkriv 'spill for å starte når 2 eller flere spillere har navn"
				+ "\nSkriv 'avslutt' når som helst for å avslutte");
		
	}
	
	public void PrintRoll(List<Dice> list) {
		System.out.println("The dice show: ");
		list.stream().forEach(s ->  {
			System.out.println(s.getValue() + " ");
		});
	}
	
	public void announceWinner(Piece player) {
		System.out.println(player.getPlayerName() + " reached square " + player.getBoardPosition());
		System.out.println("The winner is: " + player.getPlayerName());
	}
	
	public void movePiece(int moves, Piece player) {
		int newPosition = player.getBoardPosition() + moves;
		System.out.println(player.getPlayerName() + " moved from square " + player.getBoardPosition()
		+ " to square " + newPosition);
	}
	
	public void shortcut(int newPosition, Piece player) {
		System.out.println(player.getPlayerName() + " hit a shortcut");
		System.out.println(player.getPlayerName() + " moved from " + player.getBoardPosition()
		+ " to " + newPosition);
	}

	public void cannotMoveThere(int sum, Piece player) {
		int newPosition = player.getBoardPosition() + sum;
		System.out.println(player.getPlayerName() + " cannot move from " 
				+ player.getBoardPosition() + " to " + newPosition);		
	}

	public void badShortcut(int newPosition, Piece player) {
		System.out.println(player.getPlayerName() + " hit a snake");
		System.out.println(player.getPlayerName() + " moved from " + player.getBoardPosition()
		+ " to " + newPosition);
		
	}
}
