
public class Letters {

	Letter[] words;
	int idx; 
	
	Letters(int size) {
		words = new Letter[size];
		idx = -1; // no instances yet
	}
	
	public void insertLetter(char n) {
		
	
		for (int i = 0; i<idx; i++) {
			if (words[i].getNum() == n) {
				words[i].incrementCount();
				return;
			}
		}
		
		Letter obj = new Letter(n);
		idx++;
		words[idx] = obj;
	}
	
	public void display() {
		for (int i = 0; i <= idx; i++) {
			words[i].display();
		}
	}
	
}
