
public class TicTacToeBoard extends Board {
	
	private XO[][] board; // array of XO markers
	private int xoCount; // holds the count of markers on the field

	public TicTacToeBoard(int r, int c) {
		
		// the keyword 'super' forces the parent class to be made first when the code
		// compiles because the child class inherits the columns and rows
		
		super(r,c); 
		board = new XO[r][c];
		// filling the array with X/O markers that have no names - they will be assigned later
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = new XO();
			}
		}
		xoCount = 0;
	}
	
	public int getXoCount() {
		return xoCount;
	}
	
	public boolean add (int r, int c ) {
		
		// check to see if input is out of bounds
		if (r >= 3 || r < 0 || c >= 3 || c < 0) {
			System.out.println("Out of bounds. Try again.");
			return false;
		}
		// check to see if a spot is already occupied
		if (board[r][c].getName() == "X" || board[r][c].getName() == "O") {
			System.out.println("Error. Space is occupied. Choose another.");
			return false;
		}
		// set marker based on the turn value
		if (XO.getTurn() == 1) {
			board[r][c].setName("X");
			xoCount++;
		} else {
			board[r][c].setName("O");
			xoCount++;
		}		
		return true;
	}
	
	public boolean winner () {

		boolean winner = false;
		int magicCount = 0;
		int[][] magicSquare = { { 8, 1, 6 },
								{ 3, 5, 7 },
								{ 4, 9, 2 }};
		
		for (int row = 0; row < board.length; row++) {			
			for(int col = 0; col < board.length; col++) {		
				if (board[row][col].getName() == "X") {
					magicCount+= magicSquare[row][col];		
					if (magicCount == 15) {
						System.out.println("X wins!");
						return winner;
					} else {
						magicCount = 0; // reset count for the next loop
						winner = false;
					}
				}
			}
		}
		
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board.length; col++) {
				if (board[row][col].getName() == "O") {
					magicCount+= magicSquare[row][col];
					if (magicCount == 15) {
						System.out.println("O wins!");
						return winner;
					} else {
						magicCount = 0; // reset count for the next loop
						winner = false;
					}
				}
			}
		}	
		return winner;
	}
	
	public String toString() {
		
//		System.out.println("-------------");
//		
//		for (int i = 0; i < board.length; i ++) {
//			System.out.print(" |");
//			for (int j = 0; j < board.length; j++) {
//				System.out.print(board[i][j] + " | ");
//			}
//			System.out.println();
//			System.out.println("-------------");
//		}
		
		
		for (int row = 0; row < board.length; row++) {
			if( row > 0) {
				System.out.print("---+---+---\n");
			}
			for (int col = 0; col < board.length; col++) {
				if(col > 0) {
					System.out.print(" | ");
				}
			System.out.print(board[row][col]);
			}
		System.out.print("\n");
		}
		
		return "";	
	}
}
