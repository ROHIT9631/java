class Swiggy
{
	
	public static double takeOrder(String foodNames)
	{
			
		if(foodNames == "Idli")
		{
			return 125.00;
		}
		if(foodNames == "Dosa")
		{
			return 155.00;
		}
		if(foodNames == "Cakes")
		{
			return 185.00;
		}
		if(foodNames == "Poha")
		{
			return 55.00;
		}
		if(foodNames == "Biryani")
		{
			return 125.00;
		}
		if(foodNames == "Appam")
		{
			return 75.00;
		}if(foodNames == "Pancakes")
		{
			return 250.00;
		}if(foodNames == "Poori")
		{
			return 150.00;
		}
		if(foodNames == "Paraths")
		{
			return 125.00;
		}
		if(foodNames == "Bath")
		{
			return 210.00;
		}
		if(foodNames == "Puttu")
		{
			return 175.00;
		}
		if(foodNames == "Pure Veg")
		{
			return 100.00;
		}
		if(foodNames == "Vada")
		{
			return 50.00;
		}
		if(foodNames == "Chole Bhature")
		{
			return 150.00;
		}
		if(foodNames == "Salad")
		{
			return 200.00;
		}
		
		return 0.0;
	}
}