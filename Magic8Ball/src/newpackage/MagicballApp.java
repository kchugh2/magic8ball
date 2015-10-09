package newpackage;
import java.util.Scanner;
import newpackage.MagicHistory;
import newpackage.Magicball;
import newpackage.Magicball;
public class MagicballApp {
	
	public static void main (String[] args)
	{
		String q;
		String a;
		String cont;
		String hist;
		Magicball ball = new Magicball();
		MagicHistory ballhistory = new MagicHistory();
		Scanner keyboard = new Scanner(System.in);
		do
		{
			System.out.println("Enter your question");
			q=keyboard.nextLine();
			a=ballhistory.shake(q);
			System.out.println(a);
			System.out.println("Press history to exit");
			hist=keyboard.next();
			keyboard.nextLine();
			if(hist.equals("history"))
				ballhistory.showHistory();
		
			
			
		}while(!hist.equals("history"));
		
	
	
	
}
}