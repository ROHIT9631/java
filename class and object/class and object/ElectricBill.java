class ElectricBill
	{
	int billId;
	String billDueDate;
	String billIsueDate
	boolean isBillpaid;
	boolean isLastPaid;
		
	public boolean createBill(int billId,String billDueDate,
						boolean isBillpaid,boolean isLastPaid)
		{
			boolean isBillcreated = false;
			if(billId>0 && billDueDate != null && billIsueDate !=null)
			{
				this.billId=billId;
				this.billDueDate=billDueDate;
				this.billIsueDate=billIsueDate;
				this.isBillpaid=isBillpaid;
				this.isLastPaid=isLastPaid;
			
				isBillcreated = true;
			}
				return isBillcreated;
		}
		public void displaybillInfo()
		{
			System.out.println("the bill id is: "+this.billDueDate);
			System.out.println("the bill due date is: "+this.billDueDate);
			System.out.println("the billIsue date is: "+this.billIsueDate);
			System.out.println("is billpaid: "+this.isBillpaid);
			System.out.println("is lastdate:  "+ this.isLastPaid);
		}
		
	}
		
		