package Inheritance;

class Employee {

    String name;
    int id;
    double salary;

    Employee(String name,int id,double salary){
        this.name= name;
        this.id=id;
        this.salary=salary;
    }

    void displayDetails(){
        System.out.println("Name:"+name+", Id:"+id+", Salary:"+ salary);
    }

}

class Manager extends Employee {
    int teamSize;

    Manager(String name,int id,double salary,int teamSize){
        super(name, id, salary);
        this.teamSize=teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager | Team Size: " + teamSize);
    }
}

class  Developer extends Employee {
    String programmingLanguage;

    Developer(String name,int id,double salary,String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer | Language: " + programmingLanguage);
    }
}

class   Intern extends Employee {
    int durationMonth;

    Intern(String name,int id,double salary,int durationMonth){
        super(name, id, salary);
        this.durationMonth=durationMonth;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern | Duration: " + durationMonth+ " months");
    }
}


public class EmployeeMain {

    public static void main(String[] args) {

        Manager m = new Manager("Ravi", 101, 80000, 5);
        Developer d = new Developer("Sneha", 102, 60000, "Java");
        Intern i = new Intern("Rahul", 103, 15000, 3);


        m.displayDetails();
        System.out.println();
        d.displayDetails();
        System.out.println();
        i.displayDetails();



    }
}

























