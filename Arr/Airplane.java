import java.util.Arrays;

class Airplane {
    public static void main(String[] args) {
        int planeIds[] = {101, 202, 303, 404, 505};
        String airlineNames[] = {"Delta", "American Airlines", "United", "Southwest", "JetBlue"};
        String planeTypes[] = {"Boeing 737", "Airbus A320", "Boeing 777", "Airbus A380", "Boeing 787"};
        int seatingCapacities[] = {200, 180, 300, 500, 240};
        String seatConfigurations[] = {"3-3", "3-3", "3-4-3", "3-4-3", "3-3-3"};

        System.out.println("Airplane IDs: " + Arrays.toString(planeIds));
        System.out.println("Airline names: " + Arrays.toString(airlineNames));
        System.out.println("Airplane types: " + Arrays.toString(planeTypes));
        System.out.println("Seating capacities: " + Arrays.toString(seatingCapacities));
        System.out.println("Seat configurations: " + Arrays.toString(seatConfigurations));
    }
}
