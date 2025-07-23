import java.util.*;

abstract class JobRole {
    private String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public abstract String getRole();
    
    @Override
    public String toString() {
        return candidateName + " - " + getRole();
    }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole {
    public DataScientist(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Data Scientist";
    }
}

class ProductManager extends JobRole {
    public ProductManager(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Product Manager";
    }
}

class Resume<T extends JobRole> {
    private T applicant;

    public Resume(T applicant) {
        this.applicant = applicant;
    }

    public T getApplicant() {
        return applicant;
    }

    @Override
    public String toString() {
        return applicant.toString();
    }
}

class ResumeProcessor {
    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            System.out.println("Screening: " + role);
        }
    }

    public static void main(String[] args) {
        List<JobRole> applicants = new ArrayList<>();
        applicants.add(new SoftwareEngineer("Alice"));
        applicants.add(new DataScientist("Bob"));
        applicants.add(new ProductManager("Carol"));

        screenResumes(applicants);
    }
}
