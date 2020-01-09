import java.util.Scanner;

public class Play {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		TicTacToeBoard xoBoard = new TicTacToeBoard(3,3); 
		
		System.out.print("Player 1's name: ");
		String player1 = input.nextLine();
		System.out.print("Player 2's name: ");
		String player2 = input.nextLine();
		
		// TODO: maybe have the program randomly assign turns and markers? 
		System.out.println("\n" +player1 + " - you are Xs and you go first.");
	
		while (xoBoard.winner() == !true) {
			System.out.println(xoBoard);
			if (xoBoard.getXoCount() % 2 == 0) {
				XO.setTurn(1);
				System.out.print(player1 + " choose position: ");
			} else { 
				XO.setTurn(0);
				System.out.print(player2 + " choose position: ");
			}
			xoBoard.add(input.nextInt(), input.nextInt());
			xoBoard.winner();
			
			if (xoBoard.winner() == true) {
				break;
			} 
		}
		input.close();
	}
}
