package university.course;
import university.department.Department;

public class Course extends Department {
    private String courseTitle;
    private int creditHours;
    private int courseStudents;

    public Course(String deptName, int facultyCount, int totalStudents,
                  String courseTitle, int creditHours, int courseStudents) {
        super(deptName, facultyCount, totalStudents);
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
        this.courseStudents = courseStudents;
    }

    public void displayCourseInfo() {
        super.showDepartmentInfo();

        System.out.println("\n----- Course Information -----");
        System.out.println("Course Title: " + this.courseTitle);
        System.out.println("Credit Hours: " + this.creditHours);
        System.out.println("Students in this Course: " + this.courseStudents);

        if (facultyCount > 0) {
            double ratio = (double) totalStudents / facultyCount;
            System.out.println("\n----- Department Ratio -----");
            System.out.printf("Student-to-Faculty Ratio: %.1f students per faculty\n", ratio);
        } else {
            System.out.println("\n----- Department Ratio -----");
            System.out.println("Cannot calculate ratio: Number of faculty is zero.");
        }
    }
}