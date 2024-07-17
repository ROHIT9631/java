class ZomatoRunner
{
	public static void main(String swi[])
	{
		double foodName = Zomato.takeOrder("Chiken Curry");
		double foodName1 = Zomato.takeOrder("Chole Bhature");
		double foodName2 = Zomato.takeOrder("Chiken lalipop");
		double foodName3 = Zomato.takeOrder("non-veg thali");
		double foodName4 = Zomato.takeOrder("rice");
		double foodName5 = Zomato.takeOrder("clod drink");
		System.out.println("chiken cuerry Price is " + foodName);
		System.out.println("Chole Bhature Price is " + foodName1);
		System.out.println("chiken lalipop Price is " + foodName2);
		System.out.println("Non-Veg Price is " + foodName3);
		System.out.println("rice Price is " + foodName4);
		System.out.println("clod drink Price is " + foodName4);
	
	}

}