//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Bilvani Kondabolu

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable
{
	private LinkedList[] table;

	public HashTable( )
	{
		table = new LinkedList[10];
	}

	public void add(Word obj)
	{  String val = obi.getValue();
		System.out.println("add");
		int i = obj.hashCode();
		table.add(i,val);


	}

	public String toString()
	{
		String output="HASHTABLE\n";










		return output;
	}
}