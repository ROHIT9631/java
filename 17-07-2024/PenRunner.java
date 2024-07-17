class PenRunner
{
	public static void main(String[]writing)
	{
		//ClassName ref=new ClassName();
		Pen ref= new Pen();
		ref.write();
		ref.name="Linclysier";
		ref.id=2;
		ref.color="Blue";
		ref.price=12.00;
		System.out.println("The Brand name is: "+ref.name);
		System.out.println("The Id number is: "+ref.id);
		System.out.println("The Pen color is: "+ref.color);
		System.out.println("The Pen Price is: "+ref.price);
		Pen ref1= new Pen();
		ref1.name="Linc";
		ref1.id=22;
		ref1.color="Red";
		ref1.price=20.00;
		System.out.println("The Brand name is: "+ref1.name);
		System.out.println("The Id number is: "+ref1.id);
		System.out.println("The Pen color is: "+ref1.color);
		System.out.println("The Pen Price is: "+ref1.price);
	}
}