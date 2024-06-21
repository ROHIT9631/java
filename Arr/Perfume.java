import java.util.Arrays;
class Perfume
 {
    public static void main(String[] args) {
        int id[] = {101, 102, 103, 104, 201, 202, 203, 204};
        String brandName[] = {"Chanel", "Dior", "Gucci", "Versace"};
        String fragranceType[] = {"Floral", "Woody", "Citrus", "Oriental"};
        String size[] = {"50ml", "100ml", "150ml", "200ml"};
		System.out.println("Perfume brand names: " + Arrays.toString(brandName));
        System.out.println("Perfume IDs: " + Arrays.toString(id));
        System.out.println("Perfume fragrance types: " + Arrays.toString(fragranceType));
        System.out.println("Perfume sizes: " + Arrays.toString(size));
    }
}
