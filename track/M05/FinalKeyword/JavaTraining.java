final class JavaTraining extends Training {
    // Final field for course code
    private final String courseCode;

    // Constructor to initialize the course code
    public JavaTraining(String courseCode) {
        this.courseCode = courseCode;
    }

    // Method to display course details dynamically from input
    public void showCourse() {
        System.out.println("Course: " + courseCode);
    }
}
