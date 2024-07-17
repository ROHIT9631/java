class GymRunner{
public static void main(String[] item){
      boolean addingEquipment=Gym.addNew("Dumbbells");
	 // System.out.println("The Gym Equipment are Added :"+addingEquipment);
	  
	   addingEquipment=Gym.addNew("Barbells ");
	//  System.out.println("The Gym Equipment are Added :"+addingEquipment);
	  
	 addingEquipment=Gym.addNew("Kettlebells");
	  //System.out.println("The Gym Equipment are Added :"+addingEquipment);
	  
	   addingEquipment=Gym.addNew("Leg Press");
	  //System.out.println("The Gym Equipment are Added :"+addingEquipment);
	  
	   addingEquipment=Gym.addNew("Chest Press");
	  //System.out.println("The Gym Equipment are Added :"+addingEquipment);
	  
	  addingEquipment=Gym.addNew("Plank Bench");
	  //System.out.println("The Gym Equipment are Added :"+addingEquipment);
	  
	  addingEquipment=Gym.addNew("Pull-up Bar");
	  //System.out.println("The Gym Equipment are Added :"+addingEquipment);
	  
	  addingEquipment=Gym.addNew("Chest Press");
	  //System.out.println("The Gym Equipment are Added :"+addingEquipment);
	  
	 
	     
		boolean gU = Gym.updateGymEquipment("Chest Press", "trieceps");
		 System.out.println("The Gym Equipment Are Updated" +gU);
		 
		 
	   Gym.getItemName();
	   System.out.println("\n\n\n");
	   
	   boolean rk=Gym.gymequiepments("Plank Bench");
		 System.out.println("hdhdgfhjkhj"+rk);
		 
		 Gym.getItemName();
}
}