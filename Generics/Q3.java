import java.util.*;

abstract class CourseType {
    private String title;

    public CourseType(String title) {
        this.title = title;
    }

    public String getTitle() { return title; }
    public abstract String getEvaluationMethod();

    @Override
    public String toString() {
        return title + " (" + getEvaluationMethod() + ")";
    }
}

class ExamCourse extends CourseType {
    public ExamCourse(String title) {
        super(title);
    }

    @Override
    public String getEvaluationMethod() {
        return "Exam-Based";
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String title) {
        super(title);
    }

    @Override
    public String getEvaluationMethod() {
        return "Assignment-Based";
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String title) {
        super(title);
    }

    @Override
    public String getEvaluationMethod() {
        return "Research-Based";
    }
}

class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return courseType.toString();
    }
}

class University {
    public static void printCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        List<CourseType> courseList = new ArrayList<>();
        courseList.add(new ExamCourse("Data Structures"));
        courseList.add(new AssignmentCourse("Software Engineering"));
        courseList.add(new ResearchCourse("AI Ethics"));

        System.out.println("All Courses:");
        printCourses(courseList);
    }
}
