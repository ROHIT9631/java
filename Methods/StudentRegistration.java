class StudentRegistration 
{
	public static boolean studentRegistrationId(String studentName, String studentId, String email, String course,
											String address, long contactNumber) 
	{ 
	  boolean isRegisterd=false;
	    System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
		return isRegisterd;
	}
}