
public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.println("CGPA       : " + CGPA);
    }

    public class PostgraduateStudent extends Student {
        private String specialization;

        public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
            super(rollNumber, name, CGPA);
            this.specialization = specialization;
        }

        public void displayPGDetails() {
            System.out.println("PG Student Roll No : " + rollNumber);
            System.out.println("PG Student Name    : " + name);
            System.out.println("Specialization     : " + specialization);
            System.out.println("CGPA               : " + getCGPA());
        }
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(202, "Sneha", 9.2, "AI & ML");
        pg.displayPGDetails();
    }


}

