package Exampleprograms;

public class vowelsCount {

	public static void main(String[] args) {
		String given="Naveen";
		given = given.toLowerCase();
		int vowelscount=0;
		for(int i=0; i<given.length(); i++)
		{
			if(given.charAt(i)=='a'||given.charAt(i)=='e' || given.charAt(i)=='i' || given.charAt(i)=='o'
					||given.charAt(i)=='u')
			{
				vowelscount++;
			}
		}
		System.out.println(vowelscount);
	}

}
