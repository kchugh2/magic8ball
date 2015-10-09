package newpackage;

import java.util.ArrayList;

import newpackage.Magicball;
public class MagicHistory extends Magicball 
{
	private ArrayList<String> qlist = new ArrayList<String>();
	private ArrayList<String> alist = new ArrayList<String>();
	private static int  count = 0;
	
	public MagicHistory()
	{
		super();}
	
	public String shake(String question)
	{	
		String response = super.shake();
		
		alist.add(response);
		qlist.add(question);
		count++;
		
		return response;
	}
	
	public void showHistory()
	{
		for(int i=0;i<count;i++)
		{
			System.out.println("Question number " + i + ": " +qlist.get(i));
			System.out.println("Answer number " + i + ": " +alist.get(i));
		}
	}
}
