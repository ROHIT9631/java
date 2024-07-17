class AirConditioner
{
	static int currenttemp;
	static int maxtemp;
	static int mintemp;
   static boolean isconnected=false;
  public static void  onOrOff(){
  if(isconnected==false)
  {
  isconnected=true;
  System.out.println("class AirConditioner On");
  }
  else if(isconnected==true)
  {
  isconnected=false;
  System.out.println("class AirConditioner Off");
  }
  return;
  }
  
  public static void increaseTemprecture()
  {
	  if(isconnected==true)
	  {
		  if(currenttemp<=maxtemp)
		  {
			  currenttemp=currenttemp+1;
			  System.out.println("the current temp"+currenttemp);
		  }
		  else{
			  System.out.println("normal temp");
		  }
		  return ;
	  }
  }
  
  
  
  public static void decreaseTemprecture()
  {
	  if(isconnected==true)
	  {
		  if(currenttemp<=mintemp)
		  {
			  currenttemp=currenttemp-1;
			  System.out.println("the current temp"+currenttemp);
		  }
		  else{
			  System.out.println("normal temp");
		  }
		  return ;
	  }
  }
  
  
  public static void  getFeatures(){
  String name="LG";
  int price=25999;
  System.out.println(" AirConditioner Name"+name);
  System.out.println(" AirConditioner Price"+price);
  return;
  }
  }
  
  
  
 