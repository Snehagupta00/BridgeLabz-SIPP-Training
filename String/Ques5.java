import java.util.Scanner;

public class Ques5 {
	
public static void generateIllegalArgumentException() {
    String text = "Example";
    String sub = text.substring(5, 2); 
}

public static void handleIllegalArgumentException() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();

    try {
        String sub = input.substring(5, 2); 
        System.out.println("Substring: " + sub);
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
    }

    sc.close();
}


    public static void main(String[] args) {
        try {
            generateIllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        handleIllegalArgumentException();
    }
}