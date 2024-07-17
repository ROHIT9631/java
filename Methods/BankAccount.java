class BankAccount{
	static double balance;
	public static void debit(double amount)
	{
		System.out.println("Debit started");
		if(amount<=balance){
		balance =balance-amount;
		}
		else {
			System.out.println("Insufficient funds");
		}
		System.out.println("Debit ended");
		return ;
	}
    public static void credit(double amount)
	{
		System.out.println("credit started");
		if(amount>0){
		balance =balance+amount;
		}
		else{
			System.out.println("Amount Can't be Zero");
		}
		System.out.println("credit ended");
		return ;
	}
	public static double getbalance()
	{
		System.out.println("fatching balance..........");
		return balance;
	}
		
	
}