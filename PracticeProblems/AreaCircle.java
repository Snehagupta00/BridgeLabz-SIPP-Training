import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
                  
           System.out.print("Enter the radius:");
     double radius = scanner.nextDouble();


   double area = Math.PI * radius * radius;

 
 System.out.print(area);
}
}

 