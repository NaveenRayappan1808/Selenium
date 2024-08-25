package Exampleprograms;

public class addNumberoSingleDigit {
	
	public static void main (String[] args)
	{
	
	System.out.println(tosingleDigit(181));
	}

static int tosingleDigit(int n)
{
	int reminder=n%9;
	
	if(reminder==0)

	return 9;
	
	else 
	
		return reminder;

}
	
}