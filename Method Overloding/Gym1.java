import java.util.Arrays;

class Gym1{
    static String name = "Muscle Gain";
    static String[] equipments = new String[8];
    static int index = 0;
}

class GymEquipmentManager {

    public static boolean addNew(String equipmentName) {
        System.out.println("The New Equipment Name Adding Started");
        boolean isCreatingEquipmentName = false;
        if (Gym1.index < Gym1.equipments.length) {
            if (equipmentName != null) {
                Gym1.equipments[Gym1.index] = equipmentName;
                Gym1.index++;
                isCreatingEquipmentName = true;
            } else {
                System.out.println("The null value can't be loaded");
            }
        } else {
            System.out.println("The places are already filled");
        }
        System.out.println("The New Equipment Name Adding Ended");
        return isCreatingEquipmentName;
    }

    public static void getItemName() {
        System.out.println("The available equipments are:");
        for (String equipment : Gym1.equipments) {
            if (equipment != null) {
                System.out.println(equipment);
            }
        }
    }

    public static boolean updateGymEquipment(String oldEquipment, String newEquipment) {
        System.out.println("The Update Equipment Started");
        boolean isEquipmentUpdated = false;
        for (int i = 0; i < Gym1.equipments.length; i++) {
            if (oldEquipment.equals(Gym1.equipments[i])) {
                Gym1.equipments[i] = newEquipment;
                isEquipmentUpdated = true;
                break;
            }
        }
        if (!isEquipmentUpdated) {
            System.out.println(oldEquipment + " not found");
        }
        System.out.println("The Update Equipment Ended");
        return isEquipmentUpdated;
    }

    public static boolean deleteGymEquipment(String equipmentToBeDeleted) {
        System.out.println("Delete equipment process started");
        boolean isGymEquipmentDeleted = false;
        int newIndex = 0;

        for (int oldIndex = 0; oldIndex < Gym.equipments.length; oldIndex++) {
            if (!equipmentToBeDeleted.equals(Gym1.equipments[oldIndex])) {
                Gym1.equipments[newIndex] = Gym1.equipments[oldIndex];
                newIndex++;
            }
        }

        if (newIndex < Gym1.index) {
            isGymEquipmentDeleted = true;
            Gym1.index = newIndex;
            Arrays.fill(Gym.equipments, newIndex, Gym1.equipments.length, null);
        }

        if (!isGymEquipmentDeleted) {
            System.out.println(equipmentToBeDeleted + " not found");
        }
        System.out.println("Delete equipment process ended");
        return isGymEquipmentDeleted;
    }
}
