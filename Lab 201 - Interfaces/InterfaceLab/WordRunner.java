//A+ Computer Science
// www.apluscompsci.com

//comparable example one
//Kara Herson
import java.util.*;
import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word x = new Word("dog");
		Word y = new Word("cat");
		System.out.println( x.compareTo(y) );
		
		//make a list of Word
		ArrayList<Word> words = new ArrayList<Word>();
		words.add(new Word("Cat"));
		words.add(new Word("Me"));
		words.add(new Word("Watermelon"));
		words.add(new Word("Snake"));
		
		//call Collections.sort() and sort the list
		Collections.sort(words);
		
		//print the list
		for (int i = 0; i < words.size(); i++)
		{
		    System.out.print (words.get(i).toString()+ "\n");
		}
  }
}