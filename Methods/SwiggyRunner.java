class SwiggyRunner
{
	public static void main(String swi[])
	{
		double foodName = Swiggy.takeOrder("Vada");
		double foodName1 = Swiggy.takeOrder("Chole Bhature");
		double foodName2 = Swiggy.takeOrder("Salad");
		double foodName3 = Swiggy.takeOrder("Pure Veg");
		double foodName4 = Swiggy.takeOrder("Puttu");
		double foodName5 = Swiggy.takeOrder("Bath");
		System.out.println("Vada Price is " + foodName);
		System.out.println("Chole Bhature Price is " + foodName1);
		System.out.println("Salad Price is " + foodName2);
		System.out.println("Pure Veg Price is " + foodName3);
		System.out.println("Puttu Price is " + foodName4);
		System.out.println("Bath Price is " + foodName4);
	
	}

}