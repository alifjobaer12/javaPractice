package university.department;

public class Department {
    protected String deptName;
    protected int facultyCount;
    protected int totalStudents;

    public Department(String deptName, int facultyCount, int totalStudents) {
        this.deptName = deptName;
        this.facultyCount = facultyCount;
        this.totalStudents = totalStudents;
    }

    protected void showDepartmentInfo() {
        System.out.println("----- Department Information -----");
        System.out.println("Department Name: " + this.deptName);
        System.out.println("Number of Faculty: " + this.facultyCount);
        System.out.println("Total Students Enrolled: " + this.totalStudents);
    }
}
