package Exampleprograms;

public class smallestNumberInArray {

	public static void main(String[] args) {
		int givenArray[]= {3,6,8,9,6,4,2,1};
		int smallesT=Integer.MAX_VALUE;
		
		for(int i=0;i<=givenArray.length-1;i++)
		{
			if(givenArray[i]<smallesT)
			{
				smallesT=givenArray[i];
			}
			
		}
		System.out.println("The smallest number is:" +smallesT);
	}

}
