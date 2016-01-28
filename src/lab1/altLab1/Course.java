package lab1.altLab1;
public abstract class Course {
   String courseName;
   String courseNumber;
   double credits;
   String prerequisites;

    public Course(String courseName, String courseNumber, double credits, String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }
    
    public abstract void getcredits();

    public String getCourseName() {
        return courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getPrerequisites() {
        return prerequisites;
    }
   
   
}
