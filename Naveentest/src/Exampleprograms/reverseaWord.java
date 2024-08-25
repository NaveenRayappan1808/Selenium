package Exampleprograms;

public class reverseaWord {

	public static void main(String[] args) {
		String given="I love Ajith";
		String reverse="";
		
		String[] split= given.split(" ");
		
		for (int i=split.length-1; i>=0 ; i--)
		{
			reverse=reverse+split[i]+" ";
		}
		
		System.out.println(reverse);

	}

}
