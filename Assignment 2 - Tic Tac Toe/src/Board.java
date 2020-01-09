
public class Board {
	
	// REMINDER: variables that are inherited must be public
	int rows;
	int cols;
	
	public Board(int r, int c) {
		
		rows = r;
		cols = c;
	}
	
	public void setRows(int r) {
		rows = r;
	}
	
	public void setCols(int c) {
		cols = c;
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getCols() {
		return cols;
	}
}
