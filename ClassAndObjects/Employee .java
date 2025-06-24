
public class Employee {
  

    String name;
    int id;
    double salary;

   
    public Employee(String empName, int empId, double empSalary) {
        name = empName;
        id = empId;
        salary = empSalary;
    }

  
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: ₹" + salary);
    }

   
    public static void main(String[] args) {
      
        Employee emp1 = new Employee("Sneha", 101, 50000.0);

       
        emp1.displayDetails();
    }
}
