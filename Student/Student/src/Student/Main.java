package Student;

public class Main {
    public static void main(String[] args) {
        // Create Students
        Student student1 = new Student("John Doe", "S123");
        Student student2 = new Student("Jane Smith", "S124");
        Student student3 = new Student("Alice Johnson", "S125");

        // Create Courses
        Course javaCourse = new Course("C101", "Introduction to Java");
        Course pythonCourse = new Course("C102", "Introduction to Python");

        // Create EnrollmentManager to manage enrollments
        EnrollmentManager enrollmentManager = new EnrollmentManager();

        // Enroll Students in Courses
        enrollmentManager.enrollStudentInCourse(student1, javaCourse);
        enrollmentManager.enrollStudentInCourse(student2, javaCourse);
        enrollmentManager.enrollStudentInCourse(student3, pythonCourse);

        // Display Course Information
        System.out.println("\nCourse Information for Java Course:");
        enrollmentManager.displayCourseInfo(javaCourse);

        System.out.println("\nCourse Information for Python Course:");
        enrollmentManager.displayCourseInfo(pythonCourse);
    }
}
