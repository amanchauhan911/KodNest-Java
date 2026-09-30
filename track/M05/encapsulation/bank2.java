import java.util.Scanner;

class Course {
    private String courseCode;

    // Set the code through the constructor
    public Course(String courseCode) {
        this.courseCode = courseCode;
    }

    // Provide only the getter
    public String getCourseCode() {
        return courseCode;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the course code from input
        if (scanner.hasNext()) {
            String inputCode = scanner.next();
            
            // Create the Course object
            Course course = new Course(inputCode);
            
            // Print the course code using the getter
            System.out.println(course.getCourseCode());
        }
        
        scanner.close();
    }
}