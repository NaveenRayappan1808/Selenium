package Exampleprograms;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		String given="naveEEEEEEEEEEEEEEen";
		String givenLowercase=given.toLowerCase();

		char[] charArray= givenLowercase.toCharArray();
		int occurance=0;
		char toFind='z';

		
		for(char word: charArray)
		{
			if(word==toFind)
			{
			occurance++;
			}
		}
		
		System.out.println("The number of occurence is: "+occurance);
	}

}
