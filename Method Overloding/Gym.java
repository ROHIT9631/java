import java.util.*;
class Gym{
   static String name="Muscle Gain";  
static String equipments[]={null,null,null,null,null,null,null,null};
static int index;
 
 public static boolean addNew(String equipmentName){
  //System.out.println("The New Equipment Name Adding Started");
      boolean isCreatingEquipmentName=false;
	  if(index<equipments.length){
	  if(equipmentName!=null){
	  equipments[index]=equipmentName;
	  index++;
	  }else{
	  System.out.println("The null value can't be loaded");
	  }
	  }else{
	  System.out.println("The places are already filled");
	  }
	 // System.out.println("The New Equipment Name Adding Started");
	  isCreatingEquipmentName=true;
	  return isCreatingEquipmentName;
  }
  public static void getItemName(){
  //System.out.println("the available equipments are :");
  for (String equipment:equipments){
 System.out.println(equipment);
  }
  }
  public static boolean updateGymEquipment(String oldEquipment,String newEquipment){
	 // System.out.println("The Upadate Equipment Stated");
	       boolean  isEquipmentUpadated=false;
		   for(int index=0; index < equipments.length; index++){
			   if(oldEquipment == equipments[index]){
				   equipments[index]= newEquipment;
				    isEquipmentUpadated=true;
			   }
		   }
		   if (isEquipmentUpadated == false){
			    System.out.println(oldEquipment+"not found");
		   }
		   
		   
	  // System.out.println("The Upadate Equipment ended");
	   return isEquipmentUpadated;
  }
  
  public static boolean gymequiepments(String gymequiepmentstobedeleted)
   {
	System.out.println("delete chat name to started");
	boolean isGymequiepymentsDeleted=false;
	int newIndex,oldIndex;
	for(newIndex=0,oldIndex=0;oldIndex<equipments.length;oldIndex++)
	{
	if(gymequiepmentstobedeleted!=equipments[oldIndex])
	{
		equipments[newIndex]=equipments[oldIndex];
		newIndex++;
	}
	}
	equipments=Arrays.copyOf(equipments,newIndex);
	if(equipments!=null)
	{
		isGymequiepymentsDeleted=true;
	}
	if(isGymequiepymentsDeleted==false)
	{
		System.out.println(gymequiepmentstobedeleted+"not found");
	}
	System.out.println("Deleted chat name to be Ended");
	return isGymequiepymentsDeleted;
   }
	  
  }


