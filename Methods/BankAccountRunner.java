class BankAccountRunner
{
public static void main(String[]Account)
{
BankAccount.credit(5000.00);
double anything=BankAccount.getbalance();
System.out.println(anything);

BankAccount.debit(2000.00);
anything=BankAccount.getbalance();
System.out.println(anything);

BankAccount.credit(8000);
anything=BankAccount.getbalance();
System.out.println(anything);

BankAccount.debit(6000);
anything=BankAccount.getbalance();
System.out.println(anything);

BankAccount.credit(25000);
anything=BankAccount.getbalance();
System.out.println(anything);

BankAccount.debit(21000);
anything=BankAccount.getbalance();
System.out.println(anything);
BankAccount.credit(0.00);
anything=BankAccount.getbalance();
System.out.println(anything);

BankAccount.debit(0.00);
anything=BankAccount.getbalance();
System.out.println(anything);
}
}