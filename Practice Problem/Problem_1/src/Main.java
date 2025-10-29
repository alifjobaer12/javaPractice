import university.course.Course;

public class Main {
    public static void main(String[] args) {

        Course cseCourse = new Course(
                "CSE",
                20,
                200,
                "Advanced Programming",
                3,
                40
        );

        cseCourse.displayCourseInfo();
    }
}