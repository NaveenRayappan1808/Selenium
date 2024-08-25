package Exampleprograms;

public class ElementPresentinnArrayorNot {

	int[] array= {1,3,4,5,6,7,8,9};
	int numberToFind=45;
	Boolean found=false;

	public void numberToFind() {

		for (int number:array)
		{
			if(number==numberToFind)
			{
				found=true;
				break;
			}
		}
		if(found)
			System.out.println("Number found");
		else
			System.out.println("Number not found");
	}

	public static void main(String[] args) {
		ElementPresentinnArrayorNot arrayorNot= new ElementPresentinnArrayorNot();
		arrayorNot.numberToFind();
	}


}
