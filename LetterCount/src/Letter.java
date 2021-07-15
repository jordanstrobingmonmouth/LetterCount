
public class Letter {
	
	private char letter;
	private int count;
	
	Letter(char s) {
		letter = s;
		count = 1;
	}
	
	public void incrementCount() {
		count++;
	}
	
	public char getNum() {
		return letter;
	}
	
	public void display() {
		System.out.println("Count of " + letter + ": " + count);
	}
	
	
}
