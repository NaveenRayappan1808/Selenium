package Exampleprograms;

public class OccuranceOfWord {

	public static void main(String[] args) {
		String given="naveen";
		given=given.toLowerCase();
		char toFind='z';
		
		int occurance=0;
		for(int i=0; i<given.length(); i++)
		{
			if(given.charAt(i)==toFind)
			{
				occurance++;
			}
		}
		System.out.println(+occurance);

	}

}
