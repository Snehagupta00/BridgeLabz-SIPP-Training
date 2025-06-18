import java.util.Scanner;
import java.util.Arrays;

public class Ques4 {

    public static char[] getCharsManually(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        return Arrays.equals(arr1, arr2); // Simple and accurate comparison
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

	}
}