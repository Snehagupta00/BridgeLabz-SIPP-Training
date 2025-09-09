public class LicensePlateValidation {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}[0-9]{4}$";

        String[] plates = {"AB1234", "A12345"};

        for (String plate : plates) {
            System.out.println(plate + " → " + plate.matches(regex));
        }
    }
}
