package lab1.altLab1;
public abstract class Course {
   private String courseName;
   private String courseNumber;
   private double credits;
   private String prerequisites;

    public Course(String courseName, String courseNumber, double credits, String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
    
    
    public double getCredits() {
        return credits;
    }
    
    public void setCredits(double credits) {
        this.credits = credits;
    }

    
   
   
}
