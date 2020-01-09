
public class XO {
	
	private String name;
	private static int turn = 1; // determines the name of the marker

	public XO() {
		name = " ";
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public static void setTurn(int t) {
		turn = t;
	}
	
	public static int getTurn() {
		return turn;
	}
	
	public String toString() {

		return name;
	
	}
}
