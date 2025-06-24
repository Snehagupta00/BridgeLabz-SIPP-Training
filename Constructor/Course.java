public class Course {

    String courseName;
    int duration;
    double fee;

    static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration      : " + duration + " months");
        System.out.println("Fee           : ₹" + fee);
    }


    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    public static void main(String[] args) {
        // Creating Course objects
        Course c1 = new Course("Java Programming", 3, 12000);
        Course c2 = new Course("Web Development", 4, 15000);

        // Display initial course details
        System.out.println("Course 1:");
        c1.displayCourseDetails();

        System.out.println("\nCourse 2:");
        c2.displayCourseDetails();

        System.out.println("\n-----------------------------\n");

        // Update institute name using class method
        Course.updateInstituteName("Tech Learning Center");

        System.out.println("\nAfter Updating Institute Name:\n");

        // Display course details again to see updated institute name
        System.out.println("Course 1:");
        c1.displayCourseDetails();

        System.out.println("\nCourse 2:");
        c2.displayCourseDetails();
    }


}
