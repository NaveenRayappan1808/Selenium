package Exampleprograms;

public class reverseaString {

	public static void main(String[] args) {
	/*	String given="naveen";
		char[] charArray= given.toCharArray();
		String reverse="";
		for(int i=charArray.length-1; i>=0; i--)
		{
			reverse=reverse+charArray[i];
		}
		System.out.println("reverse string is: "+reverse);
	}*/
		String given="naveen";
		char[] charArray= given.toCharArray();
		StringBuffer buffer= new StringBuffer();
		buffer.append(charArray);
		System.out.println("string reverse usig string buffer: "+buffer.reverse());

	}	
}
