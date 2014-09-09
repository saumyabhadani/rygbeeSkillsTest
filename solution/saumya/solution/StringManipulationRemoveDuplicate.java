package codeChallenge;

public class StringManipulationRemoveDuplicate
{	private String stringToChange;
	public StringManipulationRemoveDuplicate(String string)
	{
		this.stringToChange=string;
	}
	public String removeDuplicateCharacters()
	{	
		String changedString="";//this will store elements from stringToChange occurring only once 
		changedString=changedString+stringToChange.charAt(0);//the first element of original string is the first element os new String
		boolean isElementPresent=false;
		int changedStringCounter=1;//since the changedString has one element
		for(int i=1;i<stringToChange.length();i++)
		{
			for(int j=0;j<changedStringCounter;j++)//to compare all the elements of changedString with a particular element of stringToChange
			{
				if(stringToChange.charAt(i)==changedString.charAt(j))
					isElementPresent=true;//if an element taken is already present in changedString
			}
			if(!isElementPresent)//if the element is not present it is concatenated at the end of changedString and counter is incremented by 1
			{
				changedString+=stringToChange.charAt(i);
				changedStringCounter++;
			}
			isElementPresent=false;
		}
		return changedString;
	}
}
