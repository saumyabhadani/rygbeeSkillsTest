package codeChallenge;
/**
 * the program main inputs a String and creates two String manipulation classes StringManipulationRemoveDuplicate and 
 * StringManipulationRemoveConsequetiveDuplicate.
 * 
 * @author Saumya
 * @version 1.0
 * @since 08-09-2014
 *
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringManipulationRemoveDuplicate changeStr1=new StringManipulationRemoveDuplicate(str);
		System.out.println(changeStr1.removeDuplicateCharacters());
		StringManipulationRemoveConsequetiveDuplicate changeStr2=new StringManipulationRemoveConsequetiveDuplicate(str);
		System.out.println(changeStr2.removeConsequetiveDuplicate());
		sc.close();
	}

}
