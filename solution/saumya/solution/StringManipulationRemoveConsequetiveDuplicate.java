package codeChallenge;
/**
 * the StringManipulationRemoveConsequetiveDuplicate program has a data element stringToChange and method removeConsequetiveDuplicate
 * The method creates anotherString in which there are elements of stringToChange and they occur only once
 * 
 * @author Saumya
 * @version 1.0
 * @since 08-09-2014
 *
 */
public class StringManipulationRemoveConsequetiveDuplicate 
{	private String stringToChange;
	public StringManipulationRemoveConsequetiveDuplicate(String str)
	{
		this.stringToChange=str;
	}
	public String removeConsequetiveDuplicate()
	{
		String changedString="";//this will store elements from stringToChange occurring only once 
		changedString=changedString+stringToChange.charAt(0);//the first element of original string is the first element os new String
		for(int i=1;i<stringToChange.length();i++)
		{	if(stringToChange.charAt(i)!=stringToChange.charAt(i-1))//if a character is not equal to its preceding character
				changedString+=stringToChange.charAt(i);			//it is added to changedString
		}
		return changedString;
	}
}
