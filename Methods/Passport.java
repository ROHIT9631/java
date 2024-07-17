class Passport
{
 static String cprLoc;
 static int dcdrLoc;
 static String given;
 static String surn;
 static String ddob;
 static String eemail;
 static boolean isisloginsame;
 static String iidd;
 static String ppassword;
 static String conformpass; 
 static String hintQuestion;
 static String hhintAns;
 static String ccaptcha;
 

public static boolean createPassport(String cprLocation,int dcdrLocation, String givenName,String surname,
									 String dob, String email, boolean isloginSameEmail,String Id, String password, String confpassword, 
									String hintsQue, String hintAns, String captcha)
 {
boolean isPassportDataCreated=false;
if(cprLocation !=null && dcdrLocation >0 && givenName != null && surname != null && dob !=null && email !=null && isloginSameEmail!= false && 
	Id != null && password != null && confpassword !=null && hintAns !=null && hintsQue !=null && captcha !=null)
	{
		System.out.println("Passport Created started");

cprLoc=cprLocation;
dcdrLoc=dcdrLocation;
surn=surname;
given=givenName;
ddob=dob;
eemail=email;
isisloginsame=isloginSameEmail;
iidd=Id;
ppassword=password;
conformpass=confpassword;
hintQuestion=hintsQue;
hhintAns=hintAns;
ccaptcha=captcha;
System.out.println("Passport created.....................");
System.out.println("Passport created ended......");



 // System.out.println("The cprLocation is :"+cprLocation);
 // System.out.println("The dcdrLocationis :"+dcdrLocation);
 // System.out.println("The GivenName is :"+givenName);
 // System.out.println("The DOB is :"+dob);
 // System.out.println("The Email is :"+email);
 // System.out.println("is loginsame email :"+isloginSameEmail);
 // System.out.println("The Password is :"+password);
 // System.out.println("The ConformPassword :"+confpassword);
 // System.out.println("The hintQuestion:"+hintsQue);
 // System.out.println("The QuestionAnswer :"+hintAns);
// 5 System.out.println("The Captcha :"+captcha);

		return isPassportDataCreated=true;
 }
 else{
	 System.out.println("Enter the valid details");
	 return isPassportDataCreated;
 }
 	
 }	
	
 public static void getpassport(){
 System.out.println("The cprLocation is :"+cprLoc);
System.out.println("The dcdrLocationis :"+dcdrLoc);
System.out.println("The GivenName is :"+surn);
 System.out.println("The GivenName is :"+given);
  System.out.println("The DOB is :"+ddob);
  System.out.println("The Email is :"+eemail);
  System.out.println("is loginsame email :"+isisloginsame);
  System.out.println("The Password is :"+ppassword);
  System.out.println("The ConformPassword :"+conformpass);
  System.out.println("The hintQuestion:"+hintQuestion);
  System.out.println("The QuestionAnswer :"+hhintAns);
 System.out.println("The Captcha :"+ccaptcha);
} 
}

