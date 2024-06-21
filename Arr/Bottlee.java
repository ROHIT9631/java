import java.util.Arrays;

class Bottlee {
    public static void main(String[] args) {
        int id[] = {1, 2, 3, 4, 7, 8, 9, 10, 22, 44, 78, 87};
        String brandName[] = {"BlueSpring", "thirst", "Aqua", "Drinkwell"};
        String type[] = {"Glass", "Fiber", "Plastic", "Paper"};
        String storageCapacity[] = {"1Liter", "2Liter", "5Liter", "10Liter"};

        System.out.println("Bottle brand names: " + Arrays.toString(brandName));
        System.out.println("Bottle IDs: " + Arrays.toString(id));
        System.out.println("Bottle types: " + Arrays.toString(type));
        System.out.println("Bottle capacities: " + Arrays.toString(storageCapacity));
    }
}
