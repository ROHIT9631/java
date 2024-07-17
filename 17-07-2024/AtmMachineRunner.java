class AtmMachineRunner
{
	public static void main(String[]deposite)
	{
		AtmMachine ref=new AtmMachine();
		ref.deposite();
		ref.companyName="SBI";
		ref.atmid=3546;
		ref.color="Purpel";
		ref.weight="60KG";
		System.out.println("Atm company Name is " +ref.companyName);
		System.out.println("Atm company Name is " +ref.atmid);
		System.out.println("Atm company Name is " +ref.color);
		System.out.println("Atm company Name is " +ref.weight);
	}
}
		