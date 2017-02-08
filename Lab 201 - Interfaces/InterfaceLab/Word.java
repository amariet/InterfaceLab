//A+ Computer Science
// www.apluscompsci.com

//generic comparable example
//Kara Herson

public class Word implements Comparable<Word>
{
  private String orig;

  public Word(String s) { orig = s; };

  public int compareTo(Word other) 
  {
     //added code to complete 
     if(orig.length() > other.toString().length())
       return 1;
     else if(orig.length() < other.toString().length()) 
       return -1;
     return 0; 
  }

  public String toString() { return orig; }
}
