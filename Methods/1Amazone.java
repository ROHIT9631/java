class BankAccount{
	static double balance;
	public static void debit(double amount)
	{
		System.out.println("Debit started");
		balance =balance-amount;
		System.out.println("Debit ended");
		return;
	}
	
}