import java.util.Arrays;

class Metro {
    public static void main(String[] args) {
        int lineIds[] = {1, 2, 3, 4, 5, 6};
        String lineNames[] = {"Red Line", "Blue Line", "Green Line", "Yellow Line", "Purple Line", "Orange Line"};
        String stationNames[] = {"Central Station", "East Station", "West Station", "North Station", "South Station"};
        int trainCapacities[] = {100, 200, 300, 400, 500};
		System.out.println("Metro line names: " + Arrays.toString(lineNames));
        System.out.println("Metro line IDs: " + Arrays.toString(lineIds));
        System.out.println("Metro station names: " + Arrays.toString(stationNames));
        System.out.println("Metro train capacities: " + Arrays.toString(trainCapacities));
    }
}
