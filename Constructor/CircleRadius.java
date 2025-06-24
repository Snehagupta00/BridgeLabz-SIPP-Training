public class CircleRadius {

    double radius;

    // Default constructor
    public CircleRadius(){
        radius = 1.0;
    }


    // Parameterized constructor
    public CircleRadius(double radius){
        this.radius = radius;
    }

    public  double calculateArea(){
        return  Math.PI * radius* radius;
    }

    public  void display(){
        System.out.println("Radius :" + radius);
        System.out.println("Area :"+ calculateArea());
    }

    public static void main(String[] args) {

        // Circle with default radius
        CircleRadius c1 = new CircleRadius();
        System.out.println("Circle 1 (Default Constructor):");
        c1.display();

        // Circle with user-defined radius
         CircleRadius c2 = new CircleRadius(2.3);
        System.out.println("Circle 2 (Parameterized Constructor):");
        c2.display();

    }



}
