class FlatBooking
{
	public static boolean flatBooking(String customerName, long customerId, String email, String flatAddress,
									String bookingDate, double bookingAmount, long contactNumber)
			{
			   boolean isBookingSuccessful = false;
			   System.out.println("Customer Name: " + customerName);
			   System.out.println("Customer ID: " + customerId);
			   System.out.println("Email: " + email);
			   System.out.println("Flat Address: " + flatAddress);
			   System.out.println("Booking Date: " + bookingDate);
			   System.out.println("Booking Amount: " + bookingAmount);
               System.out.println("Contact Number: " + contactNumber);
			   return isBookingSuccessful;
			}
}