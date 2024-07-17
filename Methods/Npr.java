class Npr
{
	public static void main(String npr[])
	{
		System.out.println("Main Method Started");
		//nPr = n!/(n-r)!
		int factNumber = 10;
		int numThing = 4;
		
		
		int nPr = Factorial.getFact(factNumber)/Factorial.getFact(Factorial.totalNumberOfThings(factNumber, numThing));
		
		System.out.println("The final result is " + nPr);
		System.out.println("Main Method Ended");
	}
	
}