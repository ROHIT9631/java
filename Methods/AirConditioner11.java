class AirConditioner11 {
	
	   static boolean isConnected;        
                 // variable      
	   static int     currentTemperature  ; 
	   static  int    minTemperature  ; 
        static int maxTemperature  = 6 ; 
		
		
		 public static void onOrOff(){
		   	 System.out.println("onOrOff started");
			isConnected = (isConnected ==false) ? true : false;
			System.out.println(isConnected);
          System.out.println("onOrOff ended");
        return ;		
	   }
	}