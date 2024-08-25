package Exampleprograms;

public class ExtractNumberfromString {

	public static void main(String[] args) {
	
		String given="naveen18456";
		int total=0;
		
		
		for (int i=0;i<given.length();i++)
		{
			if(Character.isDigit(given.charAt(i)))
			{
				total=total+ Character.getNumericValue(given.charAt(i));
			}
		}
		System.out.println("the total is:" +total);
		
	}
}
