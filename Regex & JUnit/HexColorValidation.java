public class HexColorValidation {
    public static void main(String[] args) {
        String regex = "^#[0-9A-Fa-f]{6}$";

        String[] colors = {"#FFA500", "#ff4500", "#123"};

        for (String color : colors) {
            System.out.println(color + " → " + color.matches(regex));
        }
    }
}
