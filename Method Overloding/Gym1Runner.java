public class Main{
    public static void main(String[] args) {
        GymEquipmentManager.addNew("Treadmill");
        GymEquipmentManager.addNew("Dumbbells");
        GymEquipmentManager.getItemName();
        GymEquipmentManager.updateGymEquipment("Dumbbells", "Kettlebells");
        GymEquipmentManager.getItemName();
        GymEquipmentManager.deleteGymEquipment("Treadmill");
        GymEquipmentManager.getItemName();
    }
}
