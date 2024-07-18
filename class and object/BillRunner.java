class BillRunner
{
	public static void main(String[]args)
{
	Bill bill=new Bill();
	bill.billid=101;
	bill.billissuedate="11-july-20";
	bill.billexpdate="12-Aug-20";
	bill.isbillpaid=true;
	Bill bill1=new Bill();
	bill1.billid=102;
	bill1.billissuedate="11-Aug-20";
	bill1.billexpdate="12-sep-20";
	bill1.isbillpaid=true;
	System.out.println("the billId is: "+bill.billid);
	System.out.println("the bilissuedate is: "+bill.billissuedate);
	System.out.println("the billexpdate is: "+bill.billexpdate);
	System.out.println("is billpaid: "+bill.isbillpaid);
	System.out.println("the billId is: "+bill1.billid);
	System.out.println("the bilissuedate is: "+bill1.billissuedate);
	System.out.println("the billexpdate is: "+bill1.billexpdate);
	System.out.println("is billpaid: "+bill1.isbillpaid);
}
}