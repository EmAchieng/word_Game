import java.util.*;

public class Player {
	public String name;
	public String word;
	
	public Player(String name) {
		
		this.name = name;
	}
	
	public String sayword() {
		Scanner keyboard  = new Scanner (System.in);
		word = keyboard.next();
		return word;
		
		
		
	}
	
	public boolean succeed(String lastWord) {
		
		int lastIndex = lastWord.length() -1 ;
		char lastChar = lastWord.charAt(lastIndex);
		char firstChar = word.charAt(0);
		
		if(lastChar == firstChar) {
			return true;
		}
		
		return false;
	}

}
