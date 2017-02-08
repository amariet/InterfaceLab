//A+ Computer Science
// www.apluscompsci.com

//interface example
//Kara Herson
import static java.lang.System.*;

public class Interface
{
	public static void main ( String[] args )
	{

		System.out.println("Interface example\n");

		//Locatable x = new Locatable();  //not possible to instantiate an interface

		Locatable y = new Ship(3, 4);  //change the constructor up

		out.println("Here is a ship " + y);
	}
}