//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Bilvani Kondabolu

public class Word
{
	private String Value;
	int numLeters;
	int numvowles;
	//write a constructor method
	public Word (String val)
	{ Value = val;
		numLeters =val.Length();
		numvowles = 0;
	}
	
	
	//write the getValue method
	public String getValue()
	{
		return Value;
	}
	
	
	//write the equals method
	
	
	
	//write the hashCode method
	public int hashCode()
	{
		for ( int i =0;i<Value.Length();i++)
	{ if(Value.charAt(i).equals('a')||Value.charAt(i).equals('A')||Value.charAt(i).equals('E')||Value.charAt(i).equals('e')||Value.charAt(i).equals('I')
			||Value.charAt(i).equals('i')||Value.charAt(i).equals('O')||Value.charAt(i).equals('o')||Value.charAt(i).equals('U')||Value.charAt(i).equals('u'))
	{
		numvowles++;
	}

	}
		return ((numvowles*numLeters)%10);

	}
	
	
	//write the toString method
	public String toString()
	{
        return(Value);

	
}
