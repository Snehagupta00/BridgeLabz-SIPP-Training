import java.util.Scanner;

public class PerimeterRectangle{
    public static void main(String[] args){
 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Length");
        double length = scanner.nextDouble();

        System.out.print("Enter the Width");
        double width = scanner.nextDouble();

       
        double perimeter = 2*(length+width);

        System.out.println(perimeter);
    }
}
