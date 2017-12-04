import java.util.*;

public class wordGame {
	public static void main(String[] args) {
		
		System.out.println("Insert the People Number: ");
		Scanner keyboard = new Scanner(System.in);
		int peopleNumber = keyboard.nextInt();
		System.out.println();
		
		int i = 0;
		boolean game = true;
		
		String startWord = "father";
		String userName, inputWord;
		Player [] p;
		p = new Player [peopleNumber];
		
		for (int n = 0; n < peopleNumber; n++ ) 
		{
			System.out.println("Insert Username: ");
			userName = keyboard.next();
			p[n] = new Player (userName);
			
		}
		
		System.out.println();
		
		for (int m=0; m < peopleNumber; m++)
		{
			System.out.println(m+1 + "n-th game player: " + p[m].name);
		}
		
		System.out.println();
		
		System.out.println("Starting word" + startWord);
		System.out.println();
		
	while (game) {
		
		if (i== peopleNumber) {
			
			i = 0;
		}
		
		System.out.print(p[i].name + " >> ");
		inputWord = p[i].sayword();
		game = p [i].succeed(startWord);
		startWord = inputWord;
		i++;
		
	}
		
	System.out.println(p[i - 1].name + "is defeated");
	}
	

}
