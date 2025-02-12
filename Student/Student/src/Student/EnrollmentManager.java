package Student;

public class EnrollmentManager {
    public void enrollStudentInCourse(Student student, Course course) {
        course.enrollStudent(student);
    }

    public void displayCourseInfo(Course course) {
        System.out.println(course);
        System.out.println("Enrolled Students:");
        for (Student student : course.getEnrolledStudents()) {
            System.out.println(student);
        }
    }
}

